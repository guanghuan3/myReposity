package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator
 * on 2017/3/26.
 */
@Aspect
@Component
public class TestAspect
{
    @Pointcut("@annotation(com.aspect.TestAnnotation)")
    public void annotationPointcut()
    {
    }

    @Around("annotationPointcut()")
    public void aroundPointcut(JoinPoint point)
    {
        System.err.println("使用注解切点");
    }

    @After("execution(* com.service.*Service.*(..))")
    public void afterPointcut(JoinPoint point)
    {
        test(point);
    }

    @Before("execution(* com.custom.controller.*Controller.*(..))")
    public void beforePointcut(JoinPoint point)
    {
        test(point);
    }

    private void test(JoinPoint point)
    {
        try
        {
            System.err.println(point.getTarget());
            System.err.println(point.getTarget().getClass());
            System.err.println(point.getSignature());
            System.err.println(point.getSignature().getDeclaringType());
            for (Object o : point.getArgs() )
            {
                System.err.println(o);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
