/*
 * code  
 */
package com.excelservice.excelerator.excel.converter;

/**
 * @author Anshul D Mehta
 */
public class StringTypeConverter implements TypeConverter<String> {

    @Override
    public String convert(Object value, String... pattern) {
        if (value instanceof String) {
            return ((String) value).trim();
        }
        
        return null;
    }

}
