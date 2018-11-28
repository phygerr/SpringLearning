package demo2;

/**
 * 1.客户接口的实现类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo2
 * @create 2018-11-28 13:29
 **/
public class CustomerIntImpl implements CustomerInt {

    public void setUp(){
        System.out.println("CustomerIntImpl被初始化。。。");
    }


    @Override
    public void saySome() {
        System.out.println("CustomerIntImpl的saySome方法运行了。。。");
    }

    public void destroy(){
        System.out.println("CustomerIntImpl被销毁了。。。");
    }
}
