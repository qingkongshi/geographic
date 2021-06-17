package com.jiangsu.geographic.mapper;

import com.jiangsu.geographic.bean.RiverLakeManager;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author： KeA
 * @date： 2021-06-17 15:46:54
 * @version: 1.0
 * @describe:
 */
@Mapper
public interface LogMapper {

    @Insert("insert into log ( message ) values ( #{message} )")
    Integer add(String message);
}
