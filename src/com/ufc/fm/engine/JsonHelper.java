package com.ufc.fm.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;


/**
 * 
 * @ClassName: JsonHelper
 * @Description: TODO 基于GSON，对json处理进行简单包装
 * @author: disp
 * @date 2015-11-5 下午5:22:36
 * @version 1.0
 * 
 */
public class JsonHelper {

	public static <T> T getPerson(String jsonString, Class<T> cls) {
		T t = null;
		try {
			Gson gson = new Gson();
			t = gson.fromJson(jsonString, cls);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return t;
	}

	public static <T> List<T> getPersons(String jsonString, Class<T> cls) {
		List<T> list = null;//new ArrayList<T>();
		try {
			Gson gson = new Gson();
			list = gson.fromJson(jsonString, new TypeToken<List<Class<T>>>() {
			}.getType());
		} catch (Exception e) {
		}
		return list;
	}
	
	public static Map<String, Object> keyMaps(String jsonString) {
		Map<String, Object> kv = null;//new HashMap<String, Object>();
		try {
			Gson gson = new Gson();
			kv = gson.fromJson(jsonString,
					new TypeToken<Map<String, Object>>() {
					}.getType());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return kv;
	}
	
	public static List<Map<String, Object>> listKeyMaps(String jsonString) {
		List<Map<String, Object>> list = null;//new ArrayList<Map<String, Object>>();
		try {
			Gson gson = new Gson();
			list = gson.fromJson(jsonString,
					new TypeToken<List<Map<String, Object>>>() {
					}.getType());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return list;
	}

	public static Map<String, Map<String, Object>> mvmFromJson(String jsonString) {

		Map<String, Map<String, Object>> mvm = null;
		try {
			Gson gson = new Gson();
			mvm = gson.fromJson(jsonString,
					new TypeToken<Map<String, Map<String, Object>>>() {
					}.getType());

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();

		}

		return mvm;
	}
	
	
}

