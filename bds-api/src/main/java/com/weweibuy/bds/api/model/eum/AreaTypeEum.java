package com.weweibuy.bds.api.model.eum;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * @author durenhao
 * @date 2021/5/5 20:36
 **/
@RequiredArgsConstructor
@Getter
public enum AreaTypeEum {

    PROVINCE(1, "省"),

    CITY(2, "市"),

    COUNTY(3, "区"),

    ;

    private final Integer code;

    private final String desc;


}
