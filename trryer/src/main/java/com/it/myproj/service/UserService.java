package com.it.myproj.service;


import com.it.myproj.dao.UserDao;
import com.it.myproj.javabean.UserBean;

public class UserService {

	public static void main(String[] args) throws Exception {
		UserBean userb=new UserBean();
		userb.setUsername("yangjun");
		userb.setPassword("password123456");
		userb.setNickname("DavidLover");
		int re=UserDao.Instance.addUser(userb);
		System.out.println("Service Process:"+userb.getUsername()+"\n"+"Service Process:"+userb.getPassword()+"\n"+"Service Process:"+userb.getId()+"Service Process:"+re);

	}

}
