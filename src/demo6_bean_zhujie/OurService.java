package demo6_bean_zhujie;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 我们的服务   类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo6_bean_zhujie
 * @create 2018-11-30 14:55
 **/

@Service(value = "ourService")
//  Scope是bean的作用范围，默认单例创建对象，singleton
//  prototype：多例
@Scope("prototype")
public class OurService {

    //  注解为初始化方法
    @PostConstruct
    public void setUp(){
        System.out.println("初始化。。。");
    }

    //  类方法
    public void say(){
        System.out.println("hello");
    }

    //  注解为销毁方法
    @PreDestroy
    public void destroy(){
        System.out.println("销毁了。。。");
    }
}
