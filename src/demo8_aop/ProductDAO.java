package demo8_aop;

/**
 * 产品接口
 *
 * @author phyger
 * @project SpringLearning
 * @package demo8_aop
 * @create 2018-12-01 17:36
 **/
public interface ProductDAO {
    public void save();
    public String delete();
    public void update();
    public void find();
}
