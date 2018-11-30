package demo5_zhujie;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.jws.soap.SOAPBinding;
import java.awt.*;

/**
 * demo5的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo5_zhujie
 * @create 2018-11-30 11:22
 **/
public class demo5Tes {

    @Test
    /**
     *传统方式调用实现类
     */
    public void demo1(){
        Computer computer = new ComputerImpl();
        //((ComputerImpl) computer).setName("phyger");
        computer.say();
    }

    @Test
    /**
     * Spring的注解方式调用实现类
     *
     * 使用Spring的注解方式对实现类的属性设置值得时候，可以不要set方法
     * 如果有set方法，需要将属性注入的注解要加到set方法前面
     * 如果没有set方法，需要将属性注入的注解加到属性上
     */
    public  void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Computer computer = (Computer) applicationContext.getBean("computer");
        computer.say();
    }

    @Test
    /**
     * 使用@Resource进行对象的注入
     */
    public void demo3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.save();
    }



}
