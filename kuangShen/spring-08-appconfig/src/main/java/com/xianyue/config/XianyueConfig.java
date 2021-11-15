package com.xianyue.config;

import com.xianyue.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @auther xianyue
 * @date 2021/10/2 - 星期六 - 18:16
 **/

// 只配置这部分，而不使用 @Component 配置 User类 也能正常取对象，只是没有赋值，属性都为默认值

@Configuration // 相当于 <beans> </beans> 标签
public class XianyueConfig {

    @Bean // 相当于 <bean> </bean> 标签，方法名就相当于 bean标签 的 id，取对象的时候就通过这个 名字 取
    public User user() {
        return new User();
    }
}
