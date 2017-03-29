package com.configurations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator
 * on 2017/3/26.
 */
@Configuration // 声明当前类是个配置类
@ComponentScan // 相当于xml的component-scan标签
({
        "com.service"
})
public class ServiceScanConfig
{
}
