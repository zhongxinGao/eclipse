package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import bean.Person;

public class MybatisTest {
	SqlSession sqlSession;
	@Before
	public void beforeLoadXML() {
		//加载配置文件
		InputStream inputStream = MybatisTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
		//构建SqlSession工厂
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//产生SqlSession
		sqlSession = sqlSessionFactory.openSession();
	}
	@Test
	//根据ID查询表中的数据
	public void testSelectById() {
		Person p = sqlSession.selectOne("selectPersonById", 1);
		System.out.println(p);
		sqlSession.close();
	}
	
	@Test
	//查询所有数据
	public void testAllPerson() {
		List<Person> list = sqlSession.selectList("allPerson");
		System.out.println(list);
	}
	
	@Test
	//增加一条数据
	public void testAddPerson() {
		Person p = new Person();
		p.setPname("锐雯");
		p.setPage(19);
		sqlSession.insert("insertPerson", p);
		sqlSession.close();
		sqlSession.commit();
	}
	
	@Test
	//根据ID删除一条数据
	public void deletePersonById() {
		sqlSession.delete("deletePersonById", 2);
		sqlSession.close();
		sqlSession.commit();
	}
	
	@Test
	//根据Id更新一条数据
	public void updateById() {
		Person p = new Person();
		p.setPid(22);
		p.setPname("张三");
		p.setPage(20);
		sqlSession.update("updatePersonId", 1);
		sqlSession.commit();
		sqlSession.close();
		
	}
}
