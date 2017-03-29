package com.test;

import com.bean.TestBean;
import com.configurations.AsyncConfig;
import com.configurations.BeanConfig;
import com.configurations.ConditionConfig;
import com.configurations.PropertiesConfig;
import com.service.AsyncService;
import com.service.ListService;
import com.service.PrototypeService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator
 * on 2017/3/27.
 */
@SpringBootApplication
public class TestApplication
{
    public static void main(String[] args)
    {
//        testPropertiesConfig();

//        testBeanMethod();

//        testAsync();

        testCamboCondition();

    }

    private static void testPropertiesConfig()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PropertiesConfig.class);

        PrototypeService config = context.getBean(PrototypeService.class);
        System.err.println(config.getPropertiesConfig().getName());
        System.err.println(config.getPropertiesConfig().getValue());
    }

    private static void testBeanMethod()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean tb = context.getBean(TestBean.class);

        context.close();
    }

    private static void testAsync()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncConfig.class);

        AsyncService service = (AsyncService) context.getBean("asyncService");
        for (int i =0; i < 17; i ++)
        {
            service.executeAsync(String.valueOf(i));
            service.executeAsync2(String.valueOf(i));
        }
    }

    private static void testCamboCondition()
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        ListService service = context.getBean(ListService.class);

        service.listCommand();
    }
}
