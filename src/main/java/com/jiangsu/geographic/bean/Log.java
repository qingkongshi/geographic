package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-06-17 15:46:04
 * @version: 1.0
 * @describe:
 */
@Data
public class Log {
    private Integer id;

    @JSONField(name = "message")
    private String message;
}
