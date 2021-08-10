package com.weweibuy.bds.controller;

import com.weweibuy.bds.api.model.dto.AreaQueryReqDTO;
import com.weweibuy.bds.api.model.dto.AreaRespDTO;
import com.weweibuy.bds.service.AreaService;
import com.weweibuy.framework.common.core.model.dto.CommonCodeResponse;
import com.weweibuy.framework.common.core.model.dto.CommonDataResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author durenhao
 * @date 2021/5/5 20:00
 **/
@RestController
@RequestMapping("/area")
@RequiredArgsConstructor
public class AreaController {

    private final AreaService areaService;


    @PutMapping("/init")
    public CommonCodeResponse initArea(MultipartFile file) throws IOException {
        InputStream inputStream = file.getInputStream();
        areaService.initArea(inputStream);
        return CommonCodeResponse.success();
    }

    @GetMapping("/list")
    public CommonDataResponse<List<AreaRespDTO>> query(AreaQueryReqDTO areaQueryReq) {
       return CommonDataResponse.success(areaService.query(areaQueryReq));
    }


}
