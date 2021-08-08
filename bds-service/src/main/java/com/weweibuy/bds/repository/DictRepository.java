package com.weweibuy.bds.repository;

import com.weweibuy.bds.mapper.DictValueMapper;
import com.weweibuy.bds.model.example.DictValueExample;
import com.weweibuy.bds.model.po.DictValue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author durenhao
 * @date 2021/8/8 18:30
 **/
@Repository
@RequiredArgsConstructor
public class DictRepository {

    private final DictValueMapper dictValueMapper;


    public List<DictValue> select(String namespace, String typeCode) {
        return dictValueMapper.selectByExample(DictValueExample.newAndCreateCriteria()
                .andDeletedEqualTo(false)
                .andNamespaceEqualTo(namespace)
                .andTypeCodeEqualTo(typeCode)
                .example());
    }
}
