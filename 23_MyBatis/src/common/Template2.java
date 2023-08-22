package common;

import java.io.InputStream;

import javax.annotation.Resources;
import javax.websocket.Session;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Template2 {

	public static SqlSession sqlSession() {
		
		SqlSession sqlSession = null;
		
		String resource = "/mybatis-config.xml";
		
		InputStream stream = Resources.getResourceAsStream(resource);
		
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(stream);
		Session = n	}
	
}
