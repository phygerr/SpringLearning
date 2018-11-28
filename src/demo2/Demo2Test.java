package demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * demo2的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo2
 * @create 2018-11-28 13:58
 **/
public class Demo2Test {
    @Test
    public void demo2Test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerInt customerInt = (CustomerInt) applicationContext.getBean("customerIntImpl");
        customerInt.saySome();
    }

    @Test
    public void demo2Test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerInt customerInt01 = (CustomerInt) applicationContext.getBean("customerIntImpl");
        System.out.println(customerInt01);
        CustomerInt customerInt02 = (CustomerInt) applicationContext.getBean("customerIntImpl");
        System.out.println(customerInt02);
        System.out.println(customerInt01==customerInt02);
        ((ClassPathXmlApplicationContext) applicationContext).close();
    }
}
