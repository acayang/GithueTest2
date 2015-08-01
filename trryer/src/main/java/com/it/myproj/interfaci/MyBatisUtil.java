package com.it.myproj.interfaci;

import java.io.IOException;
import java.io.Reader;
import com.it.myproj.interfaci.ExcuteSQL;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	public static SqlSessionFactory sfactory=null;//must have default value!
	static{
		Reader reader;
		try {
			reader=Resources.getResourceAsReader("ibatisconfigur.xml");
			sfactory=new SqlSessionFactoryBuilder().build(reader,"basic");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	protected <T> T myBatisExeWrite(ExcuteSQL<T> excuteSQL)throws Exception {
		SqlSession session =null;
		T t=null;
		try {
			session=sfactory.openSession(true);
			t=(T)excuteSQL.execute(session);
			session.commit();
		} catch (Exception e) {
			throw e;
		}finally{
			if (session!=null) {
				session.close();
			}
		}
		return t;
	}
}
