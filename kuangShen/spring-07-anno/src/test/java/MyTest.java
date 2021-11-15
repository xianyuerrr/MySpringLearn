import com.xianyue.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xianyue
 * @date 2021/10/2 - 星期六 - 11:38
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.name);
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user.name);
    }
}
