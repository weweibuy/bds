package com.weweibuy.bds.service;

import com.github.pagehelper.Page;
import com.weweibuy.bds.api.model.dto.AreaQueryReqDTO;
import com.weweibuy.bds.api.model.dto.AreaRespDTO;
import com.weweibuy.bds.model.dto.ExcelAreaDTO;
import com.weweibuy.bds.model.po.Area;
import com.weweibuy.bds.repository.AreaRepository;
import com.weweibuy.bds.support.AreaHelper;
import com.weweibuy.framework.common.core.utils.BeanCopyUtils;
import com.weweibuy.framework.common.db.utils.PageHelperUtils;
import com.weweibuy.framework.common.util.excel.ExcelUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

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
                .peek(AreaHelper::buildArea)
                .forEach(areaRepository::insert);
    }


    public List<AreaRespDTO> query(AreaQueryReqDTO areaQueryReq) {
        Page<Object> page = PageHelperUtils.startPage(areaQueryReq);
        return areaRepository.select(AreaHelper.buildAreaExample(areaQueryReq)).stream()
                .map(a -> BeanCopyUtils.copy(a, AreaRespDTO.class))
                .collect(Collectors.toList());

    }


}
