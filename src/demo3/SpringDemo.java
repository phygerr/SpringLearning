package demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Spring属性注入方式
 *
 * @author phyger
 * @project SpringLearning
 * @package demo3
 * @create 2018-11-28 14:40
 **/
public class SpringDemo {

    @Test
    /**
     * 构造方法方式的属性注入
     */
    public void demo1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car.toString());
    }

    @Test
    /**
     * Set方法方式的属性注入
     */
    public void demo2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("car2");
        System.out.println(car2.toString());
    }

    @Test
    /**
     * set方法进行对象属性的注入
     */
    public void demo3(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
