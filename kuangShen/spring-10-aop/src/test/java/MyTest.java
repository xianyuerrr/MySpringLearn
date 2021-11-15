import com.xianyue.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xianyue
 * @date 2021/10/3 - 星期日 - 20:45
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 返回的是新生成的代理类
        // 由于新生成的代理类和被代理类 都实现了 UserService 接口，所以可以上转型为接口类型，而不能转为 被代理类 的类型
        UserService userService = context.getBean("userServiceImpl", UserService.class);

        userService.add();
    }
}
