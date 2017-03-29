package com.configurations;

import com.service.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * Created by Administrator
 * on 2017/3/29.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@ComponentScan
@Configuration
public @interface CamboConditionConfig
{
    String[] value() default {};
}
