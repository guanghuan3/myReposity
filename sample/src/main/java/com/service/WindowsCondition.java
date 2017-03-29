package com.service;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Administrator
 * on 2017/3/29.
 */
public class WindowsCondition implements Condition
{
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata)
    {
        String osName = conditionContext.getEnvironment().getProperty("os.name");
        System.err.println("操作系统为：" + osName);
        return osName.contains("Windows");
    }
}
