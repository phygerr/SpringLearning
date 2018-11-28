package com.phyger;

/**
 * 用户接口的实现类
 *
 * @author phyger
 * @project SpringLearning
 * @package com.phyger
 * @create 2018-11-28 9:50
 **/
public class UserIntImpl implements UserInt{
    @Override
    public void say() {
        System.out.println("UserIntImpl实现类运行了。。。");
    }
}
