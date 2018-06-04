
import com.liao.mybatis.dao.OrdersMapper;
import com.liao.mybatis.pojo.Orders;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * @program: Mybatis
 * @description: 测试类
 * @author: Mr.Hiro
 * @create: 2018-06-02 10:03
 **/
public class MapperTest {
    private static SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void createSqlsessionfactory() {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis/SqlMapConfig.xml");
            // 2.构建一个sqlsessionfactory
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

            sqlSessionFactory = builder.build(inputStream);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    @Test
    public void testFindOrdersList() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<Orders> orders = mapper.findOrdersList();
        System.out.println(orders);
        sqlSession.close();
    }
}
