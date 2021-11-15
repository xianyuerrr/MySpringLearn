import com.xianyue.config.XianyueConfig;
import com.xianyue.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @auther xianyue
 * @date 2021/10/2 - 星期六 - 18:18
 **/
public class MyTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1() {
        ApplicationContext context = new AnnotationConfigApplicationContext(XianyueConfig.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
