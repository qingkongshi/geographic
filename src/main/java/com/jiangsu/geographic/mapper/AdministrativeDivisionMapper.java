package com.jiangsu.geographic.mapper;

import com.jiangsu.geographic.bean.AdministrativeDivision;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： KeA
 * @date： 2021-05-09 20:55:35
 * @version: 1.0
 * @describe:
 */
@Mapper
public interface AdministrativeDivisionMapper {

    @Select("select * from administrative_division")
    List<AdministrativeDivision> getList();
}
