import com.liao.mybatis.dao.UserMapper;
import com.liao.mybatis.pojo.QueryVo;
import com.liao.mybatis.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: Mybatis_03
 * @description: 测试类
 * @author: Mr.Hiro
 * @create: 2018-06-02 22:24
 **/
public class MybatisTest {
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
    public void fun(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("王");
        user.setId(1);
        List<User> users = mapper.findUser(user);
        System.out.println(users);
    }

    @Test
    public void fun01(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        QueryVo vo = new QueryVo();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(10);
        list.add(16);
        vo.setIds(list);
        List<User> users = mapper.findUserByIds(vo);
        for (User user : users) {
            System.out.println(user);
        }
    }


}
