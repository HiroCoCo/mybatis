import com.liao.mybatis.mapper.UserMapper;
import com.liao.mybatis.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: Mybatis_Spring
 * @description: 测试类
 * @author: Mr.Hiro
 * @create: 2018-05-31 21:21
 **/
public class DaoTest {
    @Test
    public void fun(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext-dao.xml");
        UserMapper mapper = context.getBean(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user);
    }
}

