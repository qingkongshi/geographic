package com.jiangsu.geographic.mapper;

import com.jiangsu.geographic.bean.LakeSection;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： KeA
 * @date： 2021-05-10 16:12:32
 * @version: 1.0
 * @describe:
 */
@Mapper
public interface LakeSectionMapper {

    @Select("select * from lake_section limit #{page} , #{pageSize}")
    List<LakeSection> getList(Integer page ,Integer pageSize);

}
