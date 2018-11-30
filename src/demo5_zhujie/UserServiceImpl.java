package demo5_zhujie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * UserService接口的实现类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo5_zhujie
 * @create 2018-11-30 13:41
 **/

@Service("userService")  // 相当于 <bean id="userService" class="demo5_zhujie.UserService"/>
public class UserServiceImpl implements UserService {

    //  注入Computer
    //  @Autowired()默认按照类型进行注入，不用和computer的@Component(value = "computer111")的值相等
    //  但是@Autowired()结合@Qualifier("computer111")一起完成按照名称注入
//    @Autowired()
//    @Qualifier("computer111")
    @Resource(name = "computer")
    private Computer computer;


    @Override
    public void save() {
        System.out.println("UserService接口的UserServiceImpl实现类的save方法运行了。。。");
        computer.say();
    }
}
