package com.weweibuy.bds.support;

import com.weweibuy.bds.api.model.dto.AreaQueryReqDTO;
import com.weweibuy.bds.api.model.eum.AreaTypeEum;
import com.weweibuy.bds.model.example.AreaExample;
import com.weweibuy.bds.model.po.Area;

import java.util.Optional;

/**
 * @author durenhao
 * @date 2021/8/10 21:02
 **/
public class AreaHelper {


    /**
     * 设置 地区等级  与父地区代码
     *
     * @param area
     */
    public static void buildArea(Area area) {
        Integer areaCode = area.getAreaCode();
        if (areaCode % 10000 == 0) {
            area.setParentAreaCode(0);
            area.setAreaType(AreaTypeEum.PROVINCE.getCode());
            return;
        }
        if (areaCode % 100 == 0) {
            String s = (areaCode + "").substring(0, 2) + "0000";
            area.setParentAreaCode(Integer.valueOf(s));
            area.setAreaType(AreaTypeEum.CITY.getCode());
            return;
        }
        String s = (areaCode + "").substring(0, 4) + "00";
        area.setParentAreaCode(Integer.valueOf(s));
        area.setAreaType(AreaTypeEum.COUNTY.getCode());
    }


    public static AreaExample buildAreaExample(AreaQueryReqDTO areaQueryReq) {
        AreaExample.Criteria criteria = AreaExample.newAndCreateCriteria()
                .andDeletedEqualTo(false);
        if (areaQueryReq == null) {
            return criteria.example();
        }
        Optional.ofNullable(areaQueryReq.getAreaType())
                .ifPresent(criteria::andAreaTypeEqualTo);

        Optional.ofNullable(areaQueryReq.getParentAreaCode())
                .ifPresent(criteria::andParentAreaCodeEqualTo);

        Optional.ofNullable(areaQueryReq.getAreaName())
                .ifPresent(n -> criteria.andAreaNameLike("%" + n + "%"));

        return criteria.example();
    }

}
