package demo8_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 切面类
 *
 * @author phyger
 * @project SpringLearning
 * @package demo8_aop
 * @create 2018-12-01 17:56
 **/
public class MyAspectJXML {

    /**
     * 前置通知
     * @param joinPoint
     */
    public void checkPri(JoinPoint joinPoint){
        System.out.println("前置通知（权限校验）=================="+"\n获取切入点信息："+joinPoint);
    }

    /**
     * 后置通知
     * @param result
     */
    public void addAfter(Object result){
        System.out.println("后置通知（删除通知）=================="+result);
    }

    /**
     * 环绕通知，性能监控
     * @param joinPoint
     */
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知================>");
        //  自动执行环绕通知并赋值给obj
        Object obj = joinPoint.proceed();
        System.out.println("环绕后通知================>");
        //  返回obj
        return obj;
    }

    /**
     * 异常通知，异常的时候触发
     * @param ex
     */
    public void afterThrow(Throwable ex){
        System.out.println("find方法异常了===============>"+ex.getMessage());
    }

    /**
     * 最终通知
     * 无论怎样，都会执行
     */
    public void after(){
        System.out.println("我是最终通知================>");
    }




}
