package com.weweibuy.bds.mapper;

import com.weweibuy.bds.model.example.DictTypeExample;
import com.weweibuy.bds.model.po.DictType;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface DictTypeMapper {
    long countByExample(DictTypeExample example);

    int deleteByExample(DictTypeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(DictType record);

    int insertSelective(DictType record);

    DictType selectOneByExample(DictTypeExample example);

    List<DictType> selectByExample(DictTypeExample example);

    DictType selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") DictType record, @Param("example") DictTypeExample example);

    int updateByExample(@Param("record") DictType record, @Param("example") DictTypeExample example);

    int updateByPrimaryKeySelective(DictType record);

    int updateByPrimaryKey(DictType record);
}