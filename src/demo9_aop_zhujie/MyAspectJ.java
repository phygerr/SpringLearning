package demo9_aop_zhujie;

import jdk.nashorn.internal.ir.IfNode;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * AOP的切面类 ：AOP的注解开发
 *
 * @author phyger
 * @project SpringLearning
 * @package demo9_aop_zhujie
 * @create 2018-12-11 16:02
 **/

//  开启注解
@Aspect
public class MyAspectJ {

    //  配置通知类型&&配置需要增强的方法

    /**
     * 前置通知：使用注解的方式
     */
    @Before(value = "execution(* demo9_aop_zhujie.OrderDao.save(..))")
    public void before(){
        System.out.println("我是前置通知======");
    }


    /**
     * 后置通知：使用注解的方式
      * @param result
     */
    @AfterReturning(value = "execution(* demo9_aop_zhujie.OrderDao.delete(..))",returning = "result")
    public void after(Object result){
        System.out.println("我是后置通知======"+result);
    }

    /**
     * 环绕通知：AOP的注解方式
     * @param proceedingJoinPoint
     * @return
     * @throws Throwable
     */
    @Around(value = "execution(* demo9_aop_zhujie.OrderDao.update(..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前通知======。");
        //  自动执行环绕通知并且赋值给obj
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("环绕后通知======");
        return obj;
    }

    /**
     * 异常通知
     * @param ex
     */
    @AfterThrowing(value = "execution(* demo9_aop_zhujie.OrderDao.find(..))",throwing = "ex")
    public void afterThrow(Throwable ex){
        System.out.println("查找方法有异常抛出了："+ex);
    }

    /**
     * 最终通知
     */
    @After(value = "MyAspectJ.pointcut1()")
    public void after(){
        System.out.println("我是最终通知。。。");
    }


    /**
     * AOP注解的切入点
     *
     * 定义一个切入点，在上面通知定义的时候直接使用本类名点方法名即可
     */
    @Pointcut(value = "execution(* demo9_aop_zhujie.OrderDao.find(..))")
    private void pointcut1(){}
}
