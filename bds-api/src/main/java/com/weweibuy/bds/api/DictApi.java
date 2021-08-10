package com.weweibuy.bds.api;

import com.weweibuy.bds.api.model.dto.DictRespDTO;
import com.weweibuy.framework.common.core.model.dto.CommonDataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author durenhao
 * @date 2021/8/10 21:21
 **/
@RequestMapping("/dict")
public interface DictApi {

    @GetMapping
    CommonDataResponse<List<DictRespDTO>> dict(@RequestParam("namespace") String namespace,
                                               @RequestParam("typeCode") String typeCode);


}
