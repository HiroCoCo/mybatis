import com.liao.mybatis.dao.OrdersMapper;
import com.liao.mybatis.dao.UserMapper;
import com.liao.mybatis.pojo.OrdersCustom;
import com.liao.mybatis.pojo.User;
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
 * @program: Mybatis_04
 * @description: 测试类
 * @author: Mr.Hiro
 * @create: 2018-06-03 08:40
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
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
      /*  user.setId(1);*/
        user.setUsername("王");
        List<User> users = mapper.findUserBySql(user);
        System.out.println(users);
        sqlSession.close();
    }

    @Test
    public void fun02() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(1);
        user.setUsername("刘备");
        user.setAddress("深圳");
        user.setSex("1");
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void fun03(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        OrdersMapper mapper = sqlSession.getMapper(OrdersMapper.class);
        List<OrdersCustom> orders = mapper.findOrdersByUser();
        System.out.println(orders);
        sqlSession.close();
    }
}
