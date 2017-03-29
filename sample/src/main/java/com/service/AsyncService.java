package com.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator
 * on 2017/3/29.
 */
@Service
public class AsyncService
{

    @Async
    public void executeAsync(String i)
    {
        System.err.println("Executing Async function--" + i );
    }

    @Async
    public void executeAsync2(String i)
    {
        System.err.println("Executing Async function==" + i );
    }

}
