package demo9_aop_zhujie;

/**
 * aop的用户类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo9_aop_zhujie
 * @create 2018-12-11 15:57
 **/
public class OrderDao {
    public void save(){
        System.out.println("保存数据。。。");
    }
    public String delete(){
        System.out.println("删除数据。。。");
        return "删除成功。。。";
    }
    public void update(){
        System.out.println("保存数据。。。");
    }
    public void find(){
        System.out.println("保存数据。。。");

        //  发生异常的时候，触发异常通知

        //int i = 1/0;
    }
}
