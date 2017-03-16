package com.archer.terry.utils;

import java.util.Collection;
import java.util.Map;

public class CommonUtil
{
    @SuppressWarnings("rawtypes")
    public static boolean isNullOrEmpty(Object obj)
    {
        if (obj == null)
        {
            return true;
        }
        else if (obj instanceof String)
        {
            return obj.equals("");
        }
        else if (obj instanceof Collection)
        {
            return ((Collection) obj).size() == 0;
        }
        else if (obj instanceof Map)
        {
            return ((Map) obj).size() == 0;
        }
        else if (obj instanceof Object[])
        {
            return ((Object[]) obj).length == 0;
        }
        else 
        {
            return false;
        }
    }
    
    public static boolean isNotNullOrNotEmpty(Object obj)
    {
        return !isNullOrEmpty(obj);
    }

    /**
     * 是否加密
     * 
     * @return true加密，false不加密
     */
    public static boolean isEncodeEnable()
    {
        return true;
    }
}
