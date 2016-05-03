package com.ufc.comm.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Spring Context Bean工具类
 * 
 * @author gccui
 * @email fuzhao@chinasofti.com
 * @date 2014-12-22 上午11:06:46
 */
public class SpringContextUtil implements ApplicationContextAware {
	
	/** Spring应用上下文环境 */
	private static ApplicationContext applicationContext;

	/**
	 * 实现ApplicationContextAware接口的回调方法，设置上下文环境
	 * 
	 * @param applicationContext
	 * @throws BeansException
	 */
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		SpringContextUtil.applicationContext = applicationContext;
	}

	/**
	 * @return ApplicationContext
	 */
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	/**
	 * 获取对象
	 * 
	 * @param name
	 * @return
	 * @return Object 一个以所给名字注册的bean的实例
	 * @throws BeansException
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Object> T getBean(String name) throws BeansException {
		return (T) applicationContext.getBean(name);
	}

	/**
	 * 获取类型为requiredType的对象
	 * 如果bean不能被类型转换，相应的异常将会被抛出（BeanNotOfRequiredTypeException）
	 * 
	 * @param name
	 *            bean注册名
	 * @param requiredType
	 *            返回对象类型
	 * @return Object 返回requiredType类型对象
	 * @throws BeansException
	 */
	public static <T> T getBean(String name, Class<T> requiredType) throws BeansException {
		return applicationContext.getBean(name, requiredType);
	}

	@SuppressWarnings("unchecked")
	public static <T> T getBean(Class<T> requiredType) throws BeansException {
		String[] names = applicationContext.getBeanNamesForType(requiredType);
		if (ArrayUtils.isEmpty(names)) {
			throw new IllegalArgumentException("没有找到Bean，类型：" + requiredType.getName());
		}
		return (T) applicationContext.getBean(names[0]);
	}

	@SuppressWarnings("unchecked")
	public static <T extends Object> List<T> getBeans(String... names) throws BeansException {
		List<T> beans = new ArrayList<T>();
		for (String name : names) {
			beans.add((T) applicationContext.getBean(name));
		}
		return beans;
	}

	@SuppressWarnings("unchecked")
	public static <T> Map<String, T> getBeans(Class<T> requiredType) throws BeansException {
		Map<String, T> beans = new HashMap<String, T>();
		String[] names = applicationContext.getBeanNamesForType(requiredType);
		for (String name : names) {
			beans.put(name, (T) applicationContext.getBean(name));
		}
		return beans;
	}

	/**
	 * 如果BeanFactory包含一个与所给名称匹配的bean定义，则返回true
	 * 
	 * @param name
	 * @return boolean
	 */
	public static boolean containsBean(String name) {
		return applicationContext.containsBean(name);
	}

	/**
	 * 判断以给定名字注册的bean定义是一个singleton还是一个prototype。
	 * 如果与给定名字相应的bean定义没有被找到，将会抛出一个异常（NoSuchBeanDefinitionException）
	 * 
	 * @param name
	 * @return boolean
	 * @throws NoSuchBeanDefinitionException
	 */
	public static boolean isSingleton(String name) throws NoSuchBeanDefinitionException {
		return applicationContext.isSingleton(name);
	}

	/**
	 * @param name
	 * @return Class 注册对象的类型
	 * @throws NoSuchBeanDefinitionException
	 */
	public static Class<?> getType(String name) throws NoSuchBeanDefinitionException {
		return applicationContext.getType(name);
	}

	/**
	 * 如果给定的bean名字在bean定义中有别名，则返回这些别名
	 * 
	 * @param name
	 * @return
	 * @throws NoSuchBeanDefinitionException
	 */
	public static String[] getAliases(String name) throws NoSuchBeanDefinitionException {
		return applicationContext.getAliases(name);
	}
	
	public static void checkApplicationContext() {
        if (applicationContext == null)
         	throw new IllegalStateException("applicaitonContext未注入,请在xml中定义SpringContextUtil");
    }
	
	public static String getApplicationServerUrl(HttpServletRequest request){
		StringBuilder url = new StringBuilder();
		url.append(request.getScheme()).append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(request.getContextPath());
		return url.toString();
	}
}
