package com.weweibuy.bds.service;

import com.weweibuy.bds.api.model.dto.DictRespDTO;
import com.weweibuy.bds.repository.DictRepository;
import com.weweibuy.framework.common.core.utils.BeanCopyUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author durenhao
 * @date 2021/8/8 18:29
 **/
@Service
@RequiredArgsConstructor
public class DictService {

    private final DictRepository dictRepository;

    public List<DictRespDTO> dict(String namespace, String typeCode) {
        return dictRepository.select(namespace, typeCode).stream()
                .map(d -> BeanCopyUtils.copy(d, DictRespDTO.class))
                .collect(Collectors.toList());
    }
}
