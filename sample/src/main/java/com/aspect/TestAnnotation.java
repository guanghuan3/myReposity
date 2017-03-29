package com.aspect;

import org.aspectj.lang.annotation.Aspect;

import java.lang.annotation.*;

/**
 * Created by Administrator
 * on 2017/3/26.
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface TestAnnotation
{
    String name() default "这是默认值";
}
