package com.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator
 * on 2017/3/26.
 */
@Configuration
@ComponentScan
(
        value =
        {
                "com.aspect"
        },
        includeFilters =
        {
                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Component.class)
        }
)
public class ComponentScanConfig
{
}
