package com.aking.ioc;

import com.aking.ioc.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName App
 * @Description
 * @Author yk
 * @Date 2020/7/16 16:08
 * @Version 1.0
 **/
public class App {
    public static void main(String[] args) {
        // create and configure beans
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ioc.xml");

        // retrieve configured instance
        Person person1 = context.getBean("pythonMan", Person.class);
        Person person2 = context.getBean("pythonMan", Person.class);

        // use configured instance
        System.out.println("person1 = " + person1);
        System.out.println(person1 == person2);
    }
}
