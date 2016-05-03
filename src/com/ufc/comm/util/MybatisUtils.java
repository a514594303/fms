package com.ufc.comm.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	public static SqlSessionFactory getFactory() throws IOException{
		String resource = "myBatisConfig.xml"; 
		//����mybatis�������ļ�����Ҳ���ع�����ӳ���ļ���
		
		InputStream  inputStream = Resources.getResourceAsStream(resource);
		//����sqlSession�Ĺ���
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		return factory;
				
	}	

}
