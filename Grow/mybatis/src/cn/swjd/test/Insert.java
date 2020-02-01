package cn.swjd.test;

import java.io.IOException;
import java.io.InputStream;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.swjd.entries.Student;

public class Insert {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Student s = new Student();
		s.setSt_no(99);
		s.setSt_name("张");
		s.setSex("女");
		s.setTel("555");
		s.setAddress("地球");
		sqlSession.insert("InsertStudent",s);
		sqlSession.commit();
		sqlSession.close();
		System.out.println("插入成功");
	}
	
}
