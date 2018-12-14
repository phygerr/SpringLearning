package demo9_aop_zhujie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * demo9的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo9_aop_zhujie
 * @create 2018-12-11 16:04
 **/

//  打开Spring整合JUnit4
@RunWith(SpringJUnit4ClassRunner.class)

//  加载配置文件
@ContextConfiguration("classpath:applicationContextAop.xml")
public class demo9Test {

    //  注入OrderDao
    @Resource(name = "orderDao")
    OrderDao orderDao = new OrderDao();
    @Test
    public void demo1(){
        orderDao.save();
        orderDao.delete();
        orderDao.update();
        orderDao.find();
    }
}
