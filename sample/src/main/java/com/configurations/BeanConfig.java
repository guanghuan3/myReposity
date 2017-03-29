package com.configurations;

import com.bean.TestBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator
 * on 2017/3/27.
 */
@Configuration
@ComponentScan("com.bean")
public class BeanConfig
{
    @Bean(initMethod = "annotationInitMethod", destroyMethod = "annotationDestroyedMethod")
    public TestBean getTestBean()
    {
        return new TestBean();
    }
}
