package com.zzaisang.practice.converter;

import com.zzaisang.practice.domain.YesNo;
import org.springframework.core.convert.converter.Converter;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-15
 */
public class YesNoConverter implements Converter<String, YesNo> {

    @Override
    public YesNo convert(String source) {
        return YesNo.create(source);
    }
}
