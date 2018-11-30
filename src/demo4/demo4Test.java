package demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * demo4的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo4
 * @create 2018-11-29 20:24
 **/
public class demo4Test {

    @Test
    public void demo4_01(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        JiHeClass jiHeClass = (JiHeClass) applicationContext.getBean("jihe");
        System.out.println(jiHeClass);
    }
}
