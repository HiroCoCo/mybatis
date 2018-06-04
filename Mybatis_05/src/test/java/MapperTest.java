import com.liao.mybatis.dao.OrdersMapper;
import com.liao.mybatis.pojo.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @program: Mybatis_05
 * @description: 测试类
 * @author: Mr.Hiro
 * @create: 2018-06-03 11:29
 **/
public class MapperTest {
    private SqlSessionFactory sqlSessionFactory = null;
    @Before
    public void createSqlsessionfactory() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/SqlMapConfig.xml");
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = builder.build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void fun(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> orders = mapper.findOrdersByUser();
        System.out.println(orders);
        sqlSession.close();
    }
}
