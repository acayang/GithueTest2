package com.it.myproj.dao;

import org.apache.ibatis.session.SqlSession;

import com.it.myproj.interfaci.ExcuteSQL;
import com.it.myproj.interfaci.MyBatisUtil;
import com.it.myproj.javabean.UserBean;

public class UserDao extends MyBatisUtil{

	public static UserDao Instance = null;//java 设置模式，单例模式。

	private UserDao() {
	}

	static {
		if (Instance == null)
			Instance = new UserDao();
	}
public int addUser(final UserBean userBean)throws Exception {
	int rescode=myBatisExeWrite(new ExcuteSQL<Integer>() {
		@Override
		public Integer execute(SqlSession session) {
			
			return session.insert("useraction.add",userBean);
		}
	});
	return rescode;
	
}

}
