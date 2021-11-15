import com.xianyue.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @auther xianyue
 * @date 2021/9/30 - 星期四 - 19:26
 **/
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext conText = new ClassPathXmlApplicationContext("beans.xml");

        Student student = (Student) conText.getBean("student");
        System.out.println(student);
    }
}

// 输出结果：
// Student{
//     name='xianyue',
//     address=Address{address='秦皇岛'},
//     books=[红楼梦, 西游记, 三国演义, 水浒传],
//     hobbys=[code, music, reading],
//     card={A=10, B=11, C=12},
//     games=[LOL, ArKnights, Genshin],
//     wife='null',
//     info={学号=20188711, 性别=男}
// }
