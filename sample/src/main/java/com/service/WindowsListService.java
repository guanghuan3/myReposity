package com.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator
 * on 2017/3/29.
 */
@Service
@Scope("prototype")
public class WindowsListService implements ListService
{
    @Override
    public void listCommand()
    {
        System.err.println("This is Windows command DIR");
    }
}
