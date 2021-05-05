package com.weweibuy.bds.controller;

import com.weweibuy.framework.common.core.model.dto.CommonDataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author durenhao
 * @date 2021/5/5 18:49
 **/
@RestController
@RequestMapping("/dict")
public class DictController {

    @GetMapping()
    public CommonDataResponse dict() {
        return CommonDataResponse.success(null);
    }

}
