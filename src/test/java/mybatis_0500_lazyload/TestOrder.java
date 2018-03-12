package mybatis_0500_lazyload;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.ymd.learn.mapper.OrderMapper;
import com.ymd.learn.model.Order;

public class TestOrder {

	SqlSession sqlSession = null;
	
	@Before
	public void init() throws Exception {
		String resource = "mybatis-configuration.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		sqlSession = sqlSessionFactory.openSession();
	}
	
	@Test
	public void testUser() {
		OrderMapper orderMapper = sqlSession.getMapper(OrderMapper.class);
		Order order = orderMapper.getOrderById(1);
		
		System.out.println(order);
//		System.out.println(order.getId());
//		System.out.println("----------------");
//		System.out.println(order.getUser());
	}
	
	
	
	
	
}
