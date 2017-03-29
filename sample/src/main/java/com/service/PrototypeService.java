package com.service;

import com.configurations.PropertiesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator
 * on 2017/3/27.
 */
@Service
@Scope(value = "prototype")
public class PrototypeService
{
    @Autowired
    private PropertiesConfig propertiesConfig;

    public PropertiesConfig getPropertiesConfig()
    {
        return propertiesConfig;
    }

    public void setPropertiesConfig(PropertiesConfig propertiesConfig)
    {
        this.propertiesConfig = propertiesConfig;
    }
}
