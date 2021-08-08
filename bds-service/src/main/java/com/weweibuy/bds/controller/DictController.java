package com.weweibuy.bds.controller;

import com.weweibuy.bds.api.model.DictRespDTO;
import com.weweibuy.bds.service.DictService;
import com.weweibuy.framework.common.core.model.dto.CommonDataResponse;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author durenhao
 * @date 2021/5/5 18:49
 **/
@RestController
@RequestMapping("/dict")
@RequiredArgsConstructor
public class DictController {

    private final DictService dictService;

    @GetMapping
    public CommonDataResponse<List<DictRespDTO>> dict(String namespace, String typeCode) {
        if (StringUtils.isBlank(namespace) || StringUtils.isBlank(typeCode)) {
            return CommonDataResponse.success(Collections.emptyList());
        }
        return CommonDataResponse.success(dictService.dict(namespace, typeCode));
    }

}
