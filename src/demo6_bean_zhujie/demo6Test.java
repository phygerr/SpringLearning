package demo6_bean_zhujie;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * demo6的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo6_bean_zhujie
 * @create 2018-11-30 15:00
 **/
public class demo6Test {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        OurService ourService = (OurService) applicationContext.getBean("ourService");
        System.out.println(ourService);
        //ourService.say();

        //  销毁在工厂关闭后才会调用
        //((ClassPathXmlApplicationContext) applicationContext).close();
        OurService ourService1 = (OurService) applicationContext.getBean("ourService");
        System.out.println(ourService1);
        ourService.say();

    }
}
