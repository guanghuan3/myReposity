package com.service;

import com.aspect.TestAnnotation;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator
 * on 2017/3/26.
 */
@Service
public class TestService
{
    @TestAnnotation
    public void test()
    {
        System.err.println("This is a test Service");
    }

    public void defaultV()
    {
        System.err.println("This is a defaultV");
    }
}
