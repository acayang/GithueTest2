package com.it.myproj.javabean;

public class UserBean {
private String password;
private int id;
private String nickname;
private String username;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getNickname() {
	return nickname;
}
public void setNickname(String nickname) {
	this.nickname = nickname;
}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public UserBean() {
}
public UserBean(String username, String password, int id, String nickname) {
	super();
	this.username = username;
	this.password = password;
	this.id = id;
	this.nickname = nickname;
}


}
