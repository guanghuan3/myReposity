package com.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator
 * on 2017/3/27.
 */
public class TestBean
{
    public TestBean()
    {
        System.err.println("This is TestBean");
    }

    @PostConstruct
    public void testInitMethod()
    {
        System.err.println("This is TestBean.testInitMethod()");
    }

    @PreDestroy
    public void testDestroyedMethod()
    {
        System.err.println("This is TestBean.testDestroyedMethod()");
    }

    public void annotationInitMethod()
    {
        System.err.println("This is annotationInitMethod");
    }

    public void annotationDestroyedMethod()
    {
        System.err.println("This is annotationDestroyedMethod");
    }
}
