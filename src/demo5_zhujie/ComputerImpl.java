package demo5_zhujie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 电脑接口的实现
 *
 * @author phyger
 * @project SpringLearning
 * @package demo5_zhujie
 * @create 2018-11-30 10:55
 **/

//  添加注解
@Component(value = "computer")
public class ComputerImpl implements Computer {
    //  如果没有set方法，则在这里进行注解注入
    @Value("王工")
    private String name;
//    如果有set方法，则在这里进行注入
//    @Value("李工")
//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public void say() {
        System.out.println("Computer接口的实现类ComputerImpl运行了。。。"+name);
    }
}
