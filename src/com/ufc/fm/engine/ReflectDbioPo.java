package com.ufc.fm.engine;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

/**
 * 
 * @ClassName: ReflectDbioPo
 * @Description: TODO 转换Mybatis自动生成的po对象，到接口规定的格式
 * @author: disp
 * @date 2015-11-13 上午9:46:27
 * @version 1.0
 * 
 */
public class ReflectDbioPo {

	// 接口定义 cust_type，数据库CUST_TYPE，mybatis又变成custType
	// custType - > cust_type
	private static String convInterName(String name) {

		int nFind = -1;
		for (int n = 0; n < name.length(); n++) {
			char ch = name.charAt(n);
			if (ch >= 'A' && ch <= 'Z') {
				nFind = n;
				break;
			}
		}

		String ret = name.toLowerCase();
		if (nFind != -1) {
			ret = ret.substring(0, nFind) + "_" + ret.substring(nFind);
		}

		return ret;
	}

	// cust_type - > custType
	private static String convFmName(String name) {

		int nFind = -1;
		for (int n = 0; n < name.length(); n++) {
			char ch = name.charAt(n);
			if (ch == '_') {
				nFind = n;
				break;
			}
		}

		String ret = name;
		if (nFind != -1) {
			String temp = name.substring(nFind + 1);
			temp = temp.substring(0, 1).toUpperCase() + temp.substring(1);// 接口定义大于两位
			ret = name.substring(0, nFind) + temp;
		}

		return ret;
	}

	protected static Field[] getBeanFields(Class cls, Field[] fs) {

		fs = (fs==null) ? cls.getDeclaredFields() : (Field[]) ArrayUtils.addAll(fs, cls.getDeclaredFields());

		if (cls.getSuperclass() != null) {
			Class clsSup = cls.getSuperclass();
			fs = getBeanFields(clsSup, fs);
		}
		return fs;
	}

	public static Map<String, Object> fmPo2Map(Object object) throws Exception {

		Map<String, Object> ret = new HashMap<String, Object>();

		// 获得对象的类型
		Class<?> classType = object.getClass();
		System.out.println("Class:" + classType.getName());

		// 获得对象的所有属性，以及父类
		//Field fields[] = classType.getDeclaredFields();
		Field fs[]=null;
		Field fields[] = getBeanFields(classType,fs);
		
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String fieldName = field.getName();
			// 通过此字段可在内部类中动态得到外部类的实例
			if ("this$0".equals(fieldName)) {
				continue;
			}

			String firstLetter = fieldName.substring(0, 1).toUpperCase();
			// 获得和属性对应的getXXX()方法的名字和方法
			String getMethodName = "get" + firstLetter + fieldName.substring(1);
			Method getMethod = classType.getMethod(getMethodName,
					new Class[] {});

			// 调用原对象的getXXX()方法
			Object value = getMethod.invoke(object, new Object[] {});

			if (value == null) {
				value = ""; // adroid客户端要求
			}
			if (value instanceof List<?>) {
				List<Map<String, Object>> tmp = new ArrayList<Map<String, Object>>();
				for (Object obj : (List<?>) value) {
					tmp.add(fmPo2Map(obj));
				}
				value = tmp;
			}
			System.out.println(i + ": " + fieldName + "->" + value);
			ret.put(convInterName(fieldName), value);
		}

		return ret;
	}

	public static Object map2FmPop(Map<String, Object> rec, Class<?> classType)
			throws Exception {

		// 获得对象的类型
		System.out.println("Class:" + classType.getName());

		// 通过默认构造方法创建一个新的对象
		Object object = classType.getConstructor(new Class[] {}).newInstance(
				new Object[] {});

		// 获得对象的所有属性，以及父类
		//Field fields[] = classType.getDeclaredFields();
		Field fs[]=null;
		Field fields[] = getBeanFields(classType,fs);

		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			String fieldName = field.getName();

			String firstLetter = fieldName.substring(0, 1).toUpperCase();

			// 获得和属性对应的setXXX()方法的名字和方法
			String setMethodName = "set" + firstLetter + fieldName.substring(1);
			Method setMethod = classType.getMethod(setMethodName,
					new Class[] { field.getType() });

			// 调用对象的setXXX()方法
			Object value = rec.get(convInterName(fieldName));

			System.out.println(i + ": " + fieldName + "->" + value);

			/*
			 * if(value != null && !((String)value).isEmpty() ){
			 * setMethod.invoke(object, new Object[] { value }); }
			 */

			setMethod.invoke(object, new Object[] { value });

		}

		return object;
	}

}
