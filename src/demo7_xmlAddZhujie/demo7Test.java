package demo7_xmlAddZhujie;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * demo7的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo7_xmlAddZhujie
 * @create 2018-11-30 16:17
 **/
public class demo7Test {
    @Test
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext3.xml");
        MyService myService = (MyService) applicationContext.getBean("myService");
        myService.sayHi();
    }
}
