package demo8_aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Spring整合Junit单元测试
 *
 * @author phyger
 * @project SpringLearning
 * @package demo8_aop
 * @create 2018-12-01 17:43
 **/

//  设置已Spring整合JUnit4单元测试的方式启动
@RunWith(SpringJUnit4ClassRunner.class)
//  加载配置文件
@ContextConfiguration("classpath:applicationContextAspectJ.xml")
public class demo8Test_Add_Junit {

    /**
     * Spring整合Junit单元测试进行测试
     */

    //  已注解方式引入接口类ProductDAO
    @Resource(name = "productDAO")
    private ProductDAO productDAO;

    @Test
    public void demo2(){
        productDAO.save();
        productDAO.delete();
        productDAO.update();
        productDAO.find();
    }

}
