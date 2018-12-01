package demo8_aop;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * demo8的测试类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo8_aop
 * @create 2018-12-01 17:40
 **/
public class demo8Test {
    @Test
    /**
     * 传统调用方式
     */
    public void demo1(){
        ProductDAO productDAO = new ProductDAOImpl();
        productDAO.save();
        productDAO.delete();
        productDAO.update();
        productDAO.find();
    }

}
