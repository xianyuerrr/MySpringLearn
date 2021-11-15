import com.xianyue.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xianyue
 * @date 2021/9/30 - 星期四 - 21:34
 **/
public class MyTest {
    public static void main(String[] args) {

    }


    // 新的测试方法
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // User user1 = (User) context.getBean("user");
        User user1 = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user1 == user2);
    }
}
