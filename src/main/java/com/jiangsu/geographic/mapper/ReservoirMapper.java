package com.jiangsu.geographic.mapper;

import com.jiangsu.geographic.bean.Reservoir;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： KeA
 * @date： 2021-05-10 16:12:54
 * @version: 1.0
 * @describe:
 */
@Mapper
public interface ReservoirMapper {
    @Select("select * from reservoir")
    List<Reservoir> getList();
}
