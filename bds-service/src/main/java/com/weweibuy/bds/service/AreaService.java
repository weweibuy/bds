package com.weweibuy.bds.service;

import com.weweibuy.bds.repository.AreaRepository;
import com.weweibuy.bds.api.model.AreaTypeEum;
import com.weweibuy.bds.model.dto.ExcelAreaDTO;
import com.weweibuy.bds.model.po.Area;
import com.weweibuy.framework.common.core.utils.BeanCopyUtils;
import com.weweibuy.framework.common.util.excel.ExcelUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.*;

/**
 * @author durenhao
 * @date 2021/5/5 20:11
 **/
@Service
@RequiredArgsConstructor
public class AreaService {

    private final AreaRepository areaRepository;

    public void initArea(InputStream inputStream) {
        List<ExcelAreaDTO> dtoList = ExcelUtils.readFromStream(inputStream, ExcelAreaDTO.class, null);

        dtoList.stream()
                .map(a -> BeanCopyUtils.copy(a, Area.class))
                .peek(a -> a.setAreaName(a.getAreaName().trim()))
                .peek(this::buildArea)
                .forEach(areaRepository::insert);

    }

    private void buildArea(Area area) {
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
}
