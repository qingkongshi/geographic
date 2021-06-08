package com.jiangsu.geographic.mapper;

import com.jiangsu.geographic.bean.RiverLakeManager;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： KeA
 * @date： 2021-05-10 16:13:13
 * @version: 1.0
 * @describe:
 */
@Mapper
public interface RiverLakeManagerMapper {

    @Select("select * from river_lake_manager limit #{page} , #{pageSize}")
    List<RiverLakeManager> getList(Integer page , Integer pageSize);

    @Select("select * from river_lake_manager")
    List<RiverLakeManager> getAllList();
}
