package cn.swjd.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.swjd.entries.Student;

public class Update {
	public static void main(String[] args) throws IOException {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession sqlSession = sqlSessionFactory.openSession();
		Student s = sqlSession.selectOne("findStudentById", 2);
		s.setSt_name("����");
		sqlSession.update("UpdateStudent", s);
		sqlSession.commit();
		sqlSession.close();
		System.out.println("�޸ĳɹ�");
	}
}
