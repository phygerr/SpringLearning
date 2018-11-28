package com.phyger;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package com.phyger
 * @create 2018-11-28 9:51
 **/
public class SpringTest {
    /**
     * 传统方式调用
     */
    @Test
    public void test1(){
        UserInt userInt = new UserIntImpl();
        userInt.say();
    }
    /**
     * Spring方式调用
     */
    @Test
    public void test2(){
        //  创建Spring的工厂
        //  读取配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //  根据id进行反射获取实现类，IOC进行实例化
        UserInt userInt = (UserInt) applicationContext.getBean("phygerUserIntImpl");
        //  调用实例的方法
        userInt.say();
    }

}
