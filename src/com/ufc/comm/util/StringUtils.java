package com.ufc.comm.util;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;

public class StringUtils extends org.apache.commons.lang3.StringUtils {
	static Random random = new Random();
	static char[] codeSequence = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	private static final Map<Class<?>, Map<String, ?>> map = new HashMap<Class<?>, Map<String, ?>>();
	private static final Map<Class<?>, String[]> methodMap = new HashMap<Class<?>, String[]>();
	private static final Map<Class<?>, Object> defalutValueMap = new HashMap<Class<?>, Object>();

	static {
		defalutValueMap.put(char.class, ' ');
		defalutValueMap.put(short.class, (short) 0);
		defalutValueMap.put(int.class, 0);
		defalutValueMap.put(long.class, 0l);
		defalutValueMap.put(float.class, 0f);
		defalutValueMap.put(double.class, 0d);
		defalutValueMap.put(boolean.class, false);

		Map<String, Boolean> booleanMap = new HashMap<String, Boolean>();
		booleanMap.put("yes", Boolean.TRUE);
		booleanMap.put("true", Boolean.TRUE);
		booleanMap.put("y", Boolean.TRUE);
		booleanMap.put("t", Boolean.TRUE);
		booleanMap.put("1", Boolean.TRUE);
		booleanMap.put("no", Boolean.FALSE);
		booleanMap.put("false", Boolean.FALSE);
		booleanMap.put("n", Boolean.FALSE);
		booleanMap.put("f", Boolean.FALSE);
		booleanMap.put("0", Boolean.FALSE);

		map.put(Boolean.class, booleanMap);
		map.put(boolean.class, booleanMap);

		methodMap.put(Short.class, new String[] { Short.class.getName(), "parseShort" });
		methodMap.put(Integer.class, new String[] { Integer.class.getName(), "parseInt" });
		methodMap.put(Long.class, new String[] { Long.class.getName(), "parseLong" });
		methodMap.put(Float.class, new String[] { Float.class.getName(), "parseFloat" });
		methodMap.put(Double.class, new String[] { Double.class.getName(), "parseDouble" });
		methodMap.put(short.class, new String[] { Short.class.getName(), "valueOf" });
		methodMap.put(int.class, new String[] { Integer.class.getName(), "valueOf" });
		methodMap.put(long.class, new String[] { Long.class.getName(), "valueOf" });
		methodMap.put(float.class, new String[] { Float.class.getName(), "valueOf" });
		methodMap.put(double.class, new String[] { Double.class.getName(), "valueOf" });

		methodMap.put(java.util.Date.class, new String[] { DateTimeUtil.class.getName(), "toDate" });
		methodMap.put(java.sql.Date.class, new String[] { DateTimeUtil.class.getName(), "toSQLDate" });
		methodMap.put(Calendar.class, new String[] { DateTimeUtil.class.getName(), "toCalendar" });

		methodMap.put(BigDecimal.class, new String[] { StringUtils.class.getName(), "toBigDecimal" });
	}

	private final static String regxpForHtml = "<([^>]*)>";

	public static String randomChars(int codeCount) {
		// randomCode用于保存随机产生的验证码，以便用户登录后进行验证。
		StringBuffer randomCode = new StringBuffer();

		// 随机产生codeCount数字的验证码。
		for (int i = 0; i < codeCount; i++) {
			// 得到随机产生的验证码数字。
			String strRand = String.valueOf(codeSequence[random.nextInt(62)]);
			// 将产生的四个随机数组合在一起。
			randomCode.append(strRand);
		}

		return randomCode.toString();
	}

	/**
	 * 判断是空字符串
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isEmptyString(String str) {
		return str == null || "".equals(str);
	}

	/**
	 * 替换标签
	 * 
	 * @param src
	 * @return
	 */
	public static String replaceLabel(String src) {
		return src.replaceAll("/<", "&lt;").replaceAll("/>", "&gt;");

	}

	/**
	 * 过滤掉所有的html标签，只显示文字内容
	 * 
	 * @param str
	 * @return
	 */
	public static String filterHtmlLable(String str) {

		if (str == null) {
			return null;
		}

		Pattern pattern = Pattern.compile(regxpForHtml);
		Matcher matcher = pattern.matcher(str);

		StringBuffer sb = new StringBuffer();
		boolean result1 = matcher.find();

		while (result1) {
			matcher.appendReplacement(sb, "");
			result1 = matcher.find();
		}

		matcher.appendTail(sb);

		return sb.toString();

	}

	// 过滤特殊字符
	public static String StringFilter(String str) throws PatternSyntaxException {
		// 只允许字母和数字
		// String regEx = "[^a-zA-Z0-9]";
		// 清除掉所有特殊字符
		String regEx = "[`~!@#$%^&*+=|{}':;',\\[\\].<>/?~！@#￥%……&*——+|{}【】‘；：”“’。，、？]";
		Pattern p = Pattern.compile(regEx);
		Matcher m = p.matcher(str);
		return m.replaceAll("").trim();
	}

	/**
	 * 去除结尾的& 符号
	 * 
	 * @return
	 */
	public static String removeUnfrendchar(String url) {
		if (url.endsWith("&")) {
			return url.substring(0, url.length() - 1);
		} else {
			return url;
		}
	}

	/**
	 * 连接所有参数,忽略空值
	 * 
	 * @author gccui
	 * @time 2013-1-11 下午6:09:43
	 * @param params
	 * @return
	 */
	public static String concatIgnoreBlank(String... params) {
		if (ArrayUtils.isEmpty(params)) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		for (String s : params) {
			if (StringUtils.isNotBlank(s)) {
				result.append(",").append(StringUtils.trimToEmpty(s));
			}
		}
		return result.length() > 0 ? result.deleteCharAt(0).toString() : result.toString();
	}

	/**
	 * 连接所有参数,逗号分隔
	 * 
	 * @author gccui
	 * @time 2013-1-5 下午12:36:20
	 * @param params
	 * @return
	 */
	public static String concat(Object... params) {
		return concat(new String[] { "," }, params);
	}

	/**
	 * 连接所有参数
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:30:40
	 * @param separator
	 *            指定分隔符
	 * @param params
	 * @return
	 */
	public static String concat(String[] separator, Object... params) {
		if (ArrayUtils.isEmpty(separator)) {
			throw new RuntimeException("分隔符不可为空.");
		}
		if (ArrayUtils.isEmpty(params)) {
			return "";
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < params.length; i++) {
			result.append(toString(params[i]));
			result.append(separator[i % separator.length]);
		}
		if (result.toString().endsWith(separator[separator.length - 1])) {
			return result.substring(0, result.length() - separator[separator.length - 1].length());
		} else {
			return result.toString();
		}
	}

	/**
	 * 转换对象为String
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:05:05
	 * @param o
	 * @return
	 */
	public static String toString(Object o) {
		if (o == null) {
			return "";
		}
		if (o instanceof String) {
			return (String) o;
		}
		try {
			Class<?> clazz = o.getClass();
			if (clazz.isArray()) {
				return StringUtils.toString((Object[]) o);
			} else {
				Method method = null;
				try {
					method = o.getClass().getDeclaredMethod("toString");
					return (String) method.invoke(o);
				} catch (Exception e) {
					method = ReflectUtils.getMatchMethod(StringUtils.class, "toString", new Class<?>[] { clazz });
					return (String) method.invoke(StringUtils.class, o);
				}
			}
		} catch (Exception e) {
			return o.toString();
		}
	}

	/**
	 * 转换数组为String
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:05:25
	 * @param s
	 * @return
	 */
	public static String toString(Object[] s) {
		if (ArrayUtils.isEmpty(s)) {
			return "";
		}
		StringBuilder sbuilder = new StringBuilder();
		for (Object o : s) {
			sbuilder.append(",").append(concat(o));
		}
		if (sbuilder.length() > 0) {
			sbuilder.deleteCharAt(0);
			sbuilder.insert(0, "{");
			sbuilder.append("}");
		}
		return sbuilder.toString();
	}

	/**
	 * 转换集合为String
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:05:37
	 * @param c
	 * @return
	 */
	public static String toString(Collection<?> c) {
		if (c.isEmpty()) {
			return "";
		}
		StringBuilder sbuilder = new StringBuilder();
		for (Object o : c) {
			sbuilder.append(",").append(concat(o));
		}
		if (sbuilder.length() > 0) {
			sbuilder.deleteCharAt(0);
			sbuilder.insert(0, "{");
			sbuilder.append("}");
		}
		return sbuilder.toString();
	}

	/**
	 * 转换Map为String
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:05:44
	 * @param m
	 * @return
	 */
	public static String toString(Map<?, ?> m) {
		if (m.isEmpty()) {
			return "";
		}
		StringBuilder sbuilder = new StringBuilder();
		for (Map.Entry<?, ?> me : m.entrySet()) {
			sbuilder.append(",").append(concat(me.getKey()));
			sbuilder.append("=");
			sbuilder.append(concat(me.getValue()));
		}
		if (sbuilder.length() > 0) {
			sbuilder.deleteCharAt(0);
			sbuilder.insert(0, "{");
			sbuilder.append("}");
		}
		return sbuilder.toString();
	}

	/**
	 * 转换对象为String
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:05:53
	 * @param c
	 * @return
	 */
	public static String toString(Calendar c) {
		if (c == null) {
			return "";
		}
		return DateTimeUtil.format(c.getTime(), "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 转换对象为String
	 * 
	 * @author gccui
	 * @time 2013-1-18 下午2:05:57
	 * @param d
	 * @return
	 */
	public static String toString(Date d) {
		if (d == null) {
			return "";
		}
		return DateTimeUtil.format(d, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 等同于Oracle nvl2
	 * 
	 * @author gccui
	 * @time 2013-1-5 下午12:32:58
	 * @param original
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static String nvl2(final String original, final String str1, final String str2) {
		if (StringUtils.isBlank(original)) {
			return str2;
		} else {
			return str1;
		}
	}

	/**
	 * 等同于Oracle nvl2
	 * 
	 * @author gccui
	 * @time 2013-1-5 下午12:33:20
	 * @param original
	 * @param str2
	 * @return
	 */
	public static String nvl2(final String original, final String replace) {
		return nvl2(original, replace, "");
	}

	public static <T> T toObject(final String src, Class<T> clazz) {
		return toObject(src, clazz, true);
	}

	@SuppressWarnings("unchecked")
	public static <T> T toObject(final String src, Class<T> clazz, boolean isdefault) {
		if (clazz == String.class) {
			return (T) src;
		}
		if (StringUtils.isBlank(src)) {
			return isdefault ? (T) defalutValueMap.get(clazz) : null;
		}

		String original = StringUtils.trim(src);
		Map<String, ?> defm = map.get(clazz);
		if (defm != null) {
			Object result = defm.get(original.toLowerCase());
			return (T) ObjectUtils.defaultIfNull(result, defalutValueMap.get(clazz));
		}

		String[] clzmethod = methodMap.get(clazz);
		if (clzmethod != null) {
			Method mtd;
			try {
				mtd = Class.forName(clzmethod[0]).getDeclaredMethod(clzmethod[1], String.class);
				return (T) mtd.invoke(Class.forName(clzmethod[0]), src);
			} catch (Exception e1) {
				throw new IllegalArgumentException(e1);
			}
		} else {
			throw new IllegalArgumentException(String.format("转换字符串%s为%s失败", src, clazz.getSimpleName()));
		}
	}

	public static Object toBigDecimal(final String src) {
		if (StringUtils.isBlank(src)) {
			return null;
		}
		if (StringUtils.indexOf(src, '.') > -1) {
			return BigDecimal.valueOf(Double.valueOf(StringUtils.trim(src)));
		} else {
			return BigDecimal.valueOf(Long.valueOf(StringUtils.trim(src)));
		}
	}

	/**
	 * 检查指定的字符串是否为空。
	 * <ul>
	 * <li>SysUtils.isEmpty(null) = true</li>
	 * <li>SysUtils.isEmpty("") = true</li>
	 * <li>SysUtils.isEmpty("   ") = true</li>
	 * <li>SysUtils.isEmpty("abc") = false</li>
	 * </ul>
	 * 
	 * @param value
	 *            待检查的字符串
	 * @return true/false
	 */
	public static boolean isEmpty(String value) {
		int strLen;
		if (value == null || (strLen = value.length()) == 0) {
			return true;
		}
		for (int i = 0; i < strLen; i++) {
			if ((Character.isWhitespace(value.charAt(i)) == false)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 检查对象是否为数字型字符串,包含负数开头的。
	 */
	public static boolean isNumeric(Object obj) {
		if (obj == null) {
			return false;
		}
		char[] chars = obj.toString().toCharArray();
		int length = chars.length;
		if (length < 1)
			return false;

		int i = 0;
		if (length > 1 && chars[0] == '-')
			i = 1;

		for (; i < length; i++) {
			if (!Character.isDigit(chars[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	 * 检查指定的字符串列表是否不为空。
	 */
	public static boolean areNotEmpty(String... values) {
		boolean result = true;
		if (values == null || values.length == 0) {
			result = false;
		} else {
			for (String value : values) {
				result &= !isEmpty(value);
			}
		}
		return result;
	}

	/**
	 * 把通用字符编码的字符串转化为汉字编码。
	 */
	public static String unicodeToChinese(String unicode) {
		StringBuilder out = new StringBuilder();
		if (!isEmpty(unicode)) {
			for (int i = 0; i < unicode.length(); i++) {
				out.append(unicode.charAt(i));
			}
		}
		return out.toString();
	}

	/**
	 * 过滤不可见字符
	 */
	public static String stripNonValidXMLCharacters(String input) {
		if (input == null || ("".equals(input)))
			return "";
		StringBuilder out = new StringBuilder();
		char current;
		for (int i = 0; i < input.length(); i++) {
			current = input.charAt(i);
			if ((current == 0x9) || (current == 0xA) || (current == 0xD) || ((current >= 0x20) && (current <= 0xD7FF)) || ((current >= 0xE000) && (current <= 0xFFFD))
					|| ((current >= 0x10000) && (current <= 0x10FFFF)))
				out.append(current);
		}
		return out.toString();
	}
}
