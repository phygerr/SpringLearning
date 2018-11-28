package demo1;

/**
 * UserDAO的Hibernate实现
 *
 * @author phyger
 * @project SpringLearning
 * @package PACKAGE_NAME
 * @create 2018-11-27 14:11
 **/
public class UserDAOHibernateImpl implements UserDAO {
    @Override
    public void save() {
        System.out.println("UserDAOHibernate运行了。。。");
    }
}
