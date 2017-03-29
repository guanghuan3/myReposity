package com.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Administrator
 * on 2017/3/27.
 */
@Configuration
@ComponentScan("com.service")
@PropertySource("classpath:test.properties")
public class PropertiesConfig
{
    @Value("${test.value}")
    private String value;

    @Value("${test.name}")
    private String name;

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
