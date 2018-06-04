import com.liao.mybatis.dao.UserMapper;
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
 * @program: IDEAMybatis
 * @description: 测试类
 * @author: Mr.Hiro
 * @create: 2018-06-04 15:03
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
        List<User> users = mapper.findUserAndOrders();
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }


}
