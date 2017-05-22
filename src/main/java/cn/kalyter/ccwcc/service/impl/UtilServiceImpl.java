package cn.kalyter.ccwcc.service.impl;

import cn.kalyter.ccwcc.service.UtilService;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * Created by Kalyter on 2017-4-29 0029.
 * 工具类的具体实现
 */
@Service
public class UtilServiceImpl implements UtilService {
    @Override
    public <T> T fillData(T sourceData, T incrementData) {
        Field[] sourceFields = sourceData.getClass().getDeclaredFields();
        for (int i = 0; i < sourceFields.length; i++) {
            Field sourceField = sourceFields[i];
            sourceField.setAccessible(true);
            String sourceName = sourceField.getName();
            sourceName = sourceName.substring(0, 1).toUpperCase() + sourceName.substring(1);
            try {
                Class type = sourceField.getType();
                String getName = "get" + sourceName;
                String setName = "set" + sourceName;
                Method sourceSetMethod = sourceData.getClass().getMethod(setName, type);
                Method incrementGetMethod = incrementData.getClass().getMethod(getName);
                if (type.getName().equals(String.class.getName())) {
                    String incrementValue = (String) incrementGetMethod.invoke(incrementData);
                    if (incrementValue != null && !incrementValue.equals("")) {
                        sourceSetMethod.invoke(sourceData, incrementValue);
                    }
                } else if (type.getName().equals(Integer.class.getName())) {
                    Integer incrementValue = (Integer) incrementGetMethod.invoke(incrementData);
                    if (incrementValue != null) {
                        sourceSetMethod.invoke(sourceData, incrementValue);
                    }
                } else if (type.getName().equals(Date.class.getName())) {
                    Date incrementValue = (Date) incrementGetMethod.invoke(incrementData);
                    if (incrementValue != null) {
                        sourceSetMethod.invoke(sourceData, incrementValue);
                    }
                } else if (type.getName().equals(Boolean.class.getName())) {
                    Boolean incrementValue = (Boolean) incrementGetMethod.invoke(incrementData);
                    if (incrementValue != null) {
                        sourceSetMethod.invoke(sourceData, incrementValue);
                    }
                }
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ignored) {
            }
        }
        return sourceData;
    }
}
