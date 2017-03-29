package com.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator
 * on 2017/3/26.
 */
@Configuration
@ComponentScan({"com.aspect", "com.service"})
@EnableAspectJAutoProxy
public class AspectScanConfig
{
}
