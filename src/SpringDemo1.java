/**
 * 测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package PACKAGE_NAME
 * @create 2018-11-27 13:39
 **/
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
    /**
     * 传统调用方式，实例化不同的实现类
     * ①调用DAO实现类
     * 如果要改用Hibernate实现类，就得改代码
     */
    @Test
    public void demo1(){
        UserDAO userDAO = new UserDAOImpl();
        userDAO.save();
    }
    @Test
    public void demo2(){
        UserDAO userDao = new UserDAOHibernateImpl();
        userDao.save();
    }

    /**
     * Spring方式的调用，前提已经配置了applicationContext.xml文件
     *
     * 切换实现类，只需要在applicationContext.xml配置文件中修改bean即可
     *
     * 设置实现类属性的值只需要在applicationContext.xml配置文件中设置property的属性即可
     */
    @Test
    public void demo3(){
        //创建Spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO =(UserDAO) applicationContext.getBean("userDAO");
        userDAO.save();
    }


    /**
     * 传统方式想要设置实现类的属性，会造成
     * ①无法面向对象编程
     * ②还得修改源代码
     * 如下：
     */
    @Test
    public void demo4(){
        UserDAOImpl userdao = new UserDAOImpl();
        userdao.setName("lifei");
        userdao.save();
    }
}
