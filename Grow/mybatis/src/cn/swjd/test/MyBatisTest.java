package cn.swjd.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.swjd.entries.Student;

public class MyBatisTest {
	public static void findStudentByIdTest(int st_id) throws Exception{
		//1.指定全局配置文件
		String resource="mybatis-config.xml";
		//读取配置文件
		InputStream inputstream=Resources.getResourceAsStream(resource);
		
		//2.根据配置文件构建SqlSessionFactory
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(inputstream);
		/*
		 * SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		 * SqlSessionFactory factory = builder.build(inputStream);
		 */
		
		//3.通过SqlSessionFactory构建SqlSession
		SqlSession sqlsession=factory.openSession();
		
		//4.SqlSession执行映射文件中定义的SQL，并返回其映射结果
		Student s=sqlsession.selectOne("cn.swjd.mapper.StudentMapper.findStudentById",st_id);
		
		//打印输出结果
		System.out.println(s.toString());
	}
	public static void main(String args[]) throws Exception{
		findStudentByIdTest(2);

	}
}
