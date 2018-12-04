package demo8_aop;

/**
 * ProductDAO接口的实现类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo8_aop
 * @create 2018-12-01 17:37
 **/

public class ProductDAOImpl implements ProductDAO{
    @Override
    public void save() {
        System.out.println("增加商品。。。");
    }

    @Override
    public String delete() {
        System.out.println("删除商品。。。");
        return "删除成功";
    }

    @Override
    public void update() {
        System.out.println("修改商品。。。");
    }

    @Override
    public void find() {
        System.out.println("查找商品。。。");
    }
}
