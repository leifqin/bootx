package com.funtl.hello.spring;

import com.funtl.hello.spring.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 */
public class MyTest {

    /**
     * 饿汉式的单例模式、工厂模式
     */
    private static final Logger logger = LoggerFactory.getLogger(MyTest.class);

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.sayHi();

        logger.info("info 级别日志");
        // 调试级别， 比如值是多少
        logger.debug("debug 级别日志");
        logger.warn("warn 级别日志");
        logger.error("error 级别日志");

        String message1 = "测试1";
        String message2 = "测试2";
        int num = 10;

        logger.info("message is ：{} {}", message1, message2);

        // String 占位符  (有%d、%f等但只用%s就可以了)
        System.out.println(String.format("message is : %s %s %s", message1, message2, num));

        // 追加模式（不推荐使用）
        System.out.println(message1.concat(message2));
    }
}
