package demo1;

/**
 * 用户接口UserDAO的实现类
 *
 * @author phyger
 * @project SpringLearning
 * @package PACKAGE_NAME
 * @create 2018-11-27 13:36
 **/
public class UserDAOImpl implements UserDAO {

    /**
     * 第一种使用DAO方式实现UserDAO接口
     */

    //  设置一个UserDAOImpl实现类的属性
    private String name;
    //  设置属性的值
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("UserDAO运行了。。。"+"你好。。。"+name);
    }
}
