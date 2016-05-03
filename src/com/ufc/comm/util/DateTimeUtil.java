package com.ufc.comm.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * 日期时间工具类
 * 
 * @author gccui
 * @email fuzhao918@163.com
 * @time 2012-10-22 下午4:01:07
 */
public class DateTimeUtil {
	private static final Map<String, String> dtfmt = new HashMap<String, String>();
	private static final Map<String, DateFormat> fmt = new HashMap<String, DateFormat>();
	static {
		dtfmt.put("\\d{4}", "yyyy");
		dtfmt.put("\\d{6}", "yyyyMM");
		dtfmt.put("\\d{8}", "yyyyMMdd");
		dtfmt.put("\\d{10}", "yyyyMMddHH");
		dtfmt.put("\\d{12}", "yyyyMMddHHmm");
		dtfmt.put("\\d{14}", "yyyyMMddHHmmss");
		dtfmt.put("\\d{4}-\\d{1,2}-\\d{1,2}", "yyyy-MM-dd");
		dtfmt.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}", "yyyy-MM-dd HH:mm");
		dtfmt.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{2}\\d{2}", "yyyy-MM-dd HHmm");
		dtfmt.put("\\d{2}\\d{2}", "HHmm");
		dtfmt.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{2}\\d{2}\\d{2}", "yyyy-MM-dd HHmmss");
		dtfmt.put("\\d{2}:\\d{2}:\\d{2}", "HH:mm:ss");
		dtfmt.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}", "yyyy-MM-dd HH:mm:ss");
		dtfmt.put("\\d{4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\..*", "yyyy-MM-dd HH:mm:ss.SSS");
		dtfmt.put("\\d{4}/\\d{1,2}/\\d{1,2}", "yyyy/MM/dd");
		dtfmt.put("\\d{4}年\\d{1,2}月\\d{1,2}日", "yyyy年MM月dd日");
		dtfmt.put("\\d{4}年\\d{1,2}月\\d{1,2}日 \\d{1,2}时\\d{1,2}分\\d{1,2}秒", "yyyy年MM月dd日 HH时mm分ss秒");

		fmt.put("yyyy", new SimpleDateFormat("yyyy"));
		fmt.put("yyyyMM", new SimpleDateFormat("yyyyMM"));
		fmt.put("yyyyMMdd", new SimpleDateFormat("yyyyMMdd"));
		fmt.put("yyyyMMddHH", new SimpleDateFormat("yyyyMMddHH"));
		fmt.put("yyyyMMddHHmm", new SimpleDateFormat("yyyyMMddHHmm"));
		fmt.put("yyyyMMddHHmmss", new SimpleDateFormat("yyyyMMddHHmmss"));
		fmt.put("yyyy-MM-dd", new SimpleDateFormat("yyyy-MM-dd"));
		fmt.put("yyyy-MM-dd HH:mm", new SimpleDateFormat("yyyy-MM-dd HH:mm"));
		fmt.put("yyyy-MM-dd HHmm", new SimpleDateFormat("yyyy-MM-dd HHmm"));
		fmt.put("yyyy-MM-dd HHmmss", new SimpleDateFormat("yyyy-MM-dd HHmmss"));
		fmt.put("yyyy-MM-dd HH:mm:ss", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
		fmt.put("HH:mm:ss", new SimpleDateFormat("HH:mm:ss"));
		fmt.put("HHmmss", new SimpleDateFormat("HHmmss"));
		fmt.put("HHmm", new SimpleDateFormat("HHmm"));
		fmt.put("yyyy-MM-dd HH:mm:ss.SSS", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS"));
		fmt.put("yyyy年MM月dd日", new SimpleDateFormat("yyyy年MM月dd日"));
		fmt.put("yyyy年MM月dd日 HH时mm分ss秒", new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒"));
		fmt.put("yyyy/MM/dd", new SimpleDateFormat("yyyy/MM/dd"));
	}

	// public static String process(final String orig){
	//
	// }
	/**
	 * 根据日期字符串取得日期格式
	 * 
	 * @param dateStr
	 * @return
	 */
	public static String getDatePattern(String dateStr) {
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		String pattern = null;
		for (String key : dtfmt.keySet()) {
			if (dateStr.matches(key)) {
				return dtfmt.get(key);
			}
		}
		return pattern;
	}

	/**
	 * 根据日期字符串生成java.util.Date
	 * 
	 * @param dateStr
	 * @return
	 */
	public static java.util.Date toDate(String dateStr) {
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		String pattern = getDatePattern(dateStr);
		if (StringUtils.isBlank(pattern)) {
			throw new IllegalArgumentException("无法识别日期字符串格式[" + dateStr + "]");
		}
		return toDate(dateStr, pattern);
	}

	/**
	 * 根据日期字符串及格式生成java.util.Date
	 * 
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static java.util.Date toDate(String dateStr, String pattern) {
		if (StringUtils.isBlank(dateStr)) {
			return null;
		}
		try {
			return DateUtils.parseDate(dateStr, new String[] { pattern });
		} catch (ParseException e) {
			throw new IllegalArgumentException(String.format("转换日期字符串不正确,字符串:%s,格式:%s", dateStr, pattern));
		}
	}

	/**
	 * 根据日期字符串生成java.sql.Date
	 * 
	 * @param dateStr
	 * @return
	 */
	public static java.sql.Date toSQLDate(String dateStr) {
		return new java.sql.Date(toDate(dateStr).getTime());
	}

	/**
	 * 根据日期字符串及格式生成java.sql.Date
	 * 
	 * @param dateStr
	 * @param pattern
	 * @return
	 */
	public static java.sql.Date toSQLDate(String dateStr, String pattern) {
		return new java.sql.Date(toDate(dateStr, pattern).getTime());
	}

	/**
	 * 根据日期字符串生成java.util.Calendar
	 * 
	 * @author gccui
	 * @time 2012-11-28 上午11:05:05
	 * @param src
	 * @return
	 */
	public static Calendar toCalendar(final String src) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(toDate(src));
		return calendar;
	}

	/**
	 * 格式化日期为指定格式字符串
	 * 
	 * @author gccui
	 * @time 2012-10-29 上午11:02:14
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static String format(final java.util.Date date, final String pattern) {
		if (StringUtils.isBlank(pattern) || !fmt.containsKey(pattern)) {
			throw new IllegalArgumentException("不支持格式化Pattern:" + pattern);
		}
		if (date == null) {
			return null;
		}
		return fmt.get(pattern).format(date);
	}

	/**
	 * 转换非标准格式日期时间为标准格式字符串
	 * 
	 * @author gccui
	 * @time 2013-5-6 下午2:20:17
	 * @param date
	 * @param time
	 * @return
	 */
	public static String getNormalDateTime(String date, String time) {
		return StringUtils.leftPad(date.replaceAll("-|/|年|月|日", ""), 8, "20") + StringUtils.rightPad(StringUtils.leftPad(time.replaceAll(":|时|分|秒", ""), 4, "0"), 6, "0");
	}

	/**
	 * 转换非标准格式日期时间为Date
	 * 
	 * @author gccui
	 * @time 2013-9-21 上午11:43:55
	 * @param date
	 * @param time
	 * @return
	 */
	public static Date getDate(String date, String time) {
		return toDate(getNormalDateTime(date, time));
	}

	/**
	 * 转换非标准格式日期时间为毫秒数
	 * 
	 * @author gccui
	 * @time 2013-9-21 上午11:43:55
	 * @param date
	 * @param time
	 * @return
	 */
	public static Long getMilliSecond(String date, String time) {
		return toDate(getNormalDateTime(date, time)).getTime();
	}

	/**
	 * 转换非标准格式日期时间为秒数
	 * 
	 * @author gccui
	 * @time 2013-9-21 上午11:43:55
	 * @param date
	 * @param time
	 * @return
	 */
	public static Long getSecond(String date, String time) {
		return getMilliSecond(date, time).longValue() / 1000;
	}

	/**
	 * 转换标准格式日期时间为秒数
	 * 
	 * @author gccui
	 * @time 2013-9-21 上午11:43:55
	 * @param datetime
	 * @return
	 */
	public static Long getSecond(String datetime) {
		if (StringUtils.isBlank(datetime)) {
			return null;
		}
		return toDate(datetime).getTime() / 1000;
	}

	/**
	 * 转换标准格式日期时间为秒数
	 * 
	 * @author gccui
	 * @time 2013-9-21 上午11:43:55
	 * @param datetime
	 * @return
	 */
	public static Long getSecond(Date date) {
		if (date == null) {
			return null;
		}
		return Long.valueOf(date.getTime() / 1000);
	}

	/**
	 * 转换标准格式日期时间为秒数
	 * 
	 * @author gccui
	 * @time 2013-11-14 下午1:24:37
	 * @param date
	 * @param time
	 * @return
	 */
	public static long getNvlSecond(String date, String time) {
		Long second = getSecond(date, time);
		if (second == null) {
			return 0;
		} else {
			return second;
		}
	}

	/**
	 * 转换标准格式日期时间为秒数
	 * 
	 * @author gccui
	 * @time 2013-11-14 下午1:24:33
	 * @param datetime
	 * @return
	 */
	public static long getNvlSecond(String datetime) {
		Long second = getSecond(datetime);
		if (second == null) {
			return 0;
		} else {
			return second;
		}
	}

	/**
	 * 转换标准格式日期时间为秒数,空返回0
	 * 
	 * @author gccui
	 * @time 2013-11-14 下午1:23:24
	 * @param date
	 * @return
	 */
	public static long getNvlSecond(Date date) {
		Long second = getSecond(date);
		if (second == null) {
			return 0;
		} else {
			return second;
		}
	}

	/**
	 * 转换秒为 x天x小时x分x秒
	 * 
	 * @author gccui
	 * @time 2013-5-23 下午3:18:03
	 * @param seconds
	 * @return
	 */
	public static String getDayHourMinSecCn(long seconds) {
		long day = seconds / (24 * 60 * 60);
		long hour = (seconds - day * 24 * 60 * 60) / (60 * 60);
		long min = (seconds - day * 24 * 60 * 60 - hour * 60 * 60) / 60;
		long sec = seconds - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60;
		StringBuffer result = new StringBuffer();
		if (day > 0) {
			result.append(day + "天");
		}
		if (hour > 0) {
			result.append(hour + "小时");
		}
		if (min > 0) {
			result.append(min + "分");
		}
		if (sec > 0) {
			result.append(sec + "秒");
		}
		if (result.length() == 0) {
			result.append("0秒");
		}
		return result.toString();
	}

	/**
	 * 转换秒为 x天x小时x分x秒
	 * 
	 * @author gccui
	 * @time 2013-5-23 下午3:18:03
	 * @param seconds
	 * @return
	 */
	public static String getDayHourMinSec(long seconds, boolean ignoreZero) {
		long day = seconds / (24 * 60 * 60);
		long hour = (seconds - day * 24 * 60 * 60) / (60 * 60);
		long min = (seconds - day * 24 * 60 * 60 - hour * 60 * 60) / 60;
		long sec = seconds - day * 24 * 60 * 60 - hour * 60 * 60 - min * 60;
		StringBuffer result = new StringBuffer();
		if (day > 0) {
			result.append(day + "天");
		}
		if (!ignoreZero) {
			result.append(StringUtils.leftPad(String.valueOf(hour), 2, '0') + ":");
			result.append(StringUtils.leftPad(String.valueOf(min), 2, '0') + ":");
			result.append(StringUtils.leftPad(String.valueOf(sec), 2, '0'));
		} else {
			if (hour > 0) {
				result.append(StringUtils.leftPad(String.valueOf(hour), 2, '0') + ":");
			}
			if (hour > 0 || min > 0) {
				result.append(StringUtils.leftPad(String.valueOf(min), 2, '0') + ":");
			}
			if (hour > 0 || min > 0 || sec > 0) {
				result.append(StringUtils.leftPad(String.valueOf(sec), 2, '0'));
			}
			if (result.length() == 0) {
				result.append("0秒");
			}
		}
		return result.toString();
	}

	/**
	 * 判断是否今天
	 * 
	 * @author gccui
	 * @date 2014-5-29 上午10:15:00
	 * @param date
	 * @return
	 * @throws ParseException
	 */
	public static boolean isToday(Date date) throws ParseException {
		return isSameDay(new Date(), date);
	}

	/**
	 * 判断两个日期是否同一天
	 * 
	 * @author gccui
	 * @date 2014-5-29 上午10:17:36
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static boolean isSameDay(Date date1, Date date2) throws ParseException {
		if (date1 == null || date2 == null) {
			return false;
		}
		return format(date1, "yyyy-MM-dd").equals(format(date2, "yyyy-MM-dd"));
	}

	/**
	 * 获取距离24点毫秒数
	 * 
	 * @author gccui
	 * @date 2014-9-3 下午5:34:19
	 * @return
	 */
	public static long getMillSecToZero() {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DATE, 1);
		return toDate(format(now.getTime(), "yyyyMMdd")).getTime() - System.currentTimeMillis();
	}

	private static Map<Integer, int[][]> truncType = new HashMap<Integer, int[][]>();
	static {
		truncType.put(Calendar.SECOND, new int[][] { { Calendar.MILLISECOND, 0 } });
		truncType.put(Calendar.MINUTE, ArrayUtils.add(truncType.get(Calendar.SECOND), new int[] { Calendar.SECOND, 0 }));
		truncType.put(Calendar.HOUR, ArrayUtils.add(truncType.get(Calendar.MINUTE), new int[] { Calendar.MINUTE, 0 }));
		truncType.put(Calendar.DATE, ArrayUtils.add(truncType.get(Calendar.HOUR), new int[] { Calendar.HOUR_OF_DAY, 0 }));
		truncType.put(Calendar.MONTH, ArrayUtils.add(truncType.get(Calendar.DATE), new int[] { Calendar.DATE, 1 }));
		truncType.put(Calendar.YEAR, ArrayUtils.add(truncType.get(Calendar.MONTH), new int[] { Calendar.MONTH, 0 }));
	}

	/**
	 * 截断
	 * 
	 * @author gccui
	 * @date 2014-9-10 下午7:43:40
	 * @param date
	 * @param type
	 *            Calendar.YEAR, Calendar.MONTH, Calendar.DATE, Calendar.DATE,
	 *            Calendar.MINUTE, Calendar.SECOND
	 * @return
	 */
	public static Date trunc(Date date, int type) {
		if (!truncType.containsKey(type)) {
			throw new RuntimeException("截断类型必须匹配：" + truncType.keySet());
		}
		Calendar now = Calendar.getInstance();
		now.setTime(date);

		int[][] values = truncType.get(type);
		for (int[] v : values) {
			now.set(v[0], v[1]);
		}
		return now.getTime();
	}

	private static final Map<String, String> truncPattern = new HashMap<String, String>();
	static {
		truncPattern.put("yyyy", "yyyy");
		truncPattern.put("yy", "yyyy");
		truncPattern.put("MM", "yyyyMM");
		truncPattern.put("dd", "yyyyMMdd");
		truncPattern.put("hh", "yyyyMMddHH");
		truncPattern.put("HH", "yyyyMMddHH");
		truncPattern.put("mm", "yyyyMMddHHmm");
		truncPattern.put("ss", "yyyyMMddHHmmss");
	}

	/**
	 * 截断日期数据
	 * 
	 * @author gccui
	 * @date 2014-9-10 下午8:12:33
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Calendar trunc(Calendar date, String pattern) {
		if (StringUtils.isBlank(pattern)) {
			pattern = "dd";
		}
		if (!truncPattern.containsKey(pattern)) {
			throw new RuntimeException("截断表达式必须匹配：" + truncPattern.keySet());
		}
		date.setTime(toDate(format(date.getTime(), truncPattern.get(pattern))));
		return date;
	}
	/**
	 * 返回日期 date 加上 afterHour 小时之后的日期
	 * @param date
	 * @param afterHour
	 * @return
	 */
	public static Date getAfterMinuteDate(Date date, int afterMinute){
		if(date != null ){
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.MINUTE, afterMinute);
			return c.getTime();
		}
		return null;
	}
	public static void main(String[] args) throws ParseException {
		System.out.println(getDayHourMinSec(60 + 86400, false));
		System.out.println(getDayHourMinSec(86400, false));
		System.out.println(getDayHourMinSec(86400 - 3600, false));
		System.out.println(getDayHourMinSec(3600, false));

		System.out.println(format(trunc(new Date(), Calendar.YEAR), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(new Date(), Calendar.MONTH), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(new Date(), Calendar.DATE), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(new Date(), Calendar.HOUR), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(new Date(), Calendar.MINUTE), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(new Date(), Calendar.SECOND), "yyyy-MM-dd HH:mm:ss"));

		System.out.println(format(trunc(Calendar.getInstance(), "yy").getTime(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(Calendar.getInstance(), "MM").getTime(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(Calendar.getInstance(), "dd").getTime(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(Calendar.getInstance(), "hh").getTime(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(Calendar.getInstance(), "mm").getTime(), "yyyy-MM-dd HH:mm:ss"));
		System.out.println(format(trunc(Calendar.getInstance(), "ss").getTime(), "yyyy-MM-dd HH:mm:ss"));

	}
}