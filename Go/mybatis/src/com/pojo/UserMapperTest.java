package com.pojo;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import com.bean.User;

public class UserMapperTest {
	 private SqlSessionFactory sqlSessionFactory;
	    @Before
	    public void setUp() throws Exception {
	        // mybatis配置文件
	        String resource = "mybatis-Config.xml";
	        // 得到配置文件流
	        InputStream inputStream = Resources.getResourceAsStream(resource);
	        // 创建会话工厂，传入mybatis的配置文件信息 
	        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	       
	    }

	    @Test
	    public void testFindUserById() throws Exception {
	    	SqlSession sqlSession = sqlSessionFactory.openSession();
		      //(很重要！！！)创建UserMapper接口的实例对象,是mybatis自动生成Usermapper代理对象
		        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
	        //调用userMapper 方法 
	        User user=userMapper.findUserById(99);

	        System.out.println(user);   
	    }
	

}
