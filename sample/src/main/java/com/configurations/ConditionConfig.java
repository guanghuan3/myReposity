package com.configurations;

import com.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * Created by Administrator
 * on 2017/3/29.
 */
@Configuration
public class ConditionConfig
{
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService getWindowsListService()
    {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService getLinuxListService()
    {
        return new LinuxListService();
    }

}
