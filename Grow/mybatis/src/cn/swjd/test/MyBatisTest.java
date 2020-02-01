package cn.swjd.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.swjd.entries.Student;

public class MyBatisTest {
	public static void findStudentByIdTest(int st_id) throws Exception{
		//1.ָ��ȫ�������ļ�
		String resource="mybatis-config.xml";
		//��ȡ�����ļ�
		InputStream inputstream=Resources.getResourceAsStream(resource);
		
		//2.���������ļ�����SqlSessionFactory
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputstream);
		/*
		 * SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		 * SqlSessionFactory factory = builder.build(inputStream);
		 */
		
		//3.ͨ��SqlSessionFactory����SqlSession
		SqlSession sqlsession=factory.openSession();
		
		//4.SqlSessionִ��ӳ���ļ��ж����SQL����������ӳ����
		Student s=sqlsession.selectOne("cn.swjd.mapper.StudentMapper.findStudentById",st_id);
		
		//��ӡ������
		System.out.println(s.toString());
	}
	public static void main(String args[]) throws Exception{
		findStudentByIdTest(2);

	}
}
