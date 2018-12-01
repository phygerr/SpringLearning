package demo7_xmlAddZhujie;


import javax.annotation.Resource;

/**
 * 我的服务类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo7_xmlAddZhujie
 * @create 2018-11-30 16:10
 **/
public class MyService {
    @Resource(name = "youDao")
    private YouDao youDao;

//    public void setYouDao(YouDao youDao) {
//        this.youDao = youDao;
//    }
//
//    public void setHerDao(HerDao herDao) {
//        this.herDao = herDao;
//    }
    @Resource(name = "herDao")
    private HerDao herDao;

    public void sayHi(){
        System.out.println("MyService的sayHi方法运行了。。。");
        youDao.sayHi();
        herDao.sayHi();
    }
}
