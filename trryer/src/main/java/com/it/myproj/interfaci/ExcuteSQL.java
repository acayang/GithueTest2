package com.it.myproj.interfaci;
import org.apache.ibatis.session.SqlSession;
public interface ExcuteSQL<T> {
	T execute(SqlSession session);
}
