package com.zzaisang.practice.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

/**
 * @author zzai_sang
 * @version 0.1.0
 * @since 2021-02-15
 */
@Getter
public enum YesNo {

    NO("아니오"),
    YES("예");

    private final String name;

    YesNo(String name) {
        this.name = name;
    }

    public boolean isYes() {
        return YES == this;
    }

    public boolean isNo() {
        return NO == this;
    }

    @JsonCreator
    public static YesNo create(String value) {
        boolean matches = value.matches("-?\\d+");
        if (matches) {
            return Integer.parseInt(value) == 1 ? YES : NO;
        } else {
            return valueOf(value.toUpperCase());
        }
    }


}
