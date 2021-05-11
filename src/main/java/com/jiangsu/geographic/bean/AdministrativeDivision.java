package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-05-09 20:40:18
 * @version: 1.0
 * @describe:
 */
@Data
public class AdministrativeDivision {
    private Integer id;

    @JSONField(name = "AD_CD")
    private String AD_CD;

    @JSONField(name = "AD_NM")
    private String AD_NM;

    @JSONField(name = "AD_SHNM")
    private String AD_SHNM;

    @JSONField(name = "AD_A")
    private Double AD_A;

    @JSONField(name = "AD_LV")
    private String AD_LV;

    @JSONField(name = "FA_AD_CD")
    private String FA_AD_CD;

    @JSONField(name = "FU_AD_NM")
    private String FU_AD_NM;

    @JSONField(name = "SHAPE")
    private String SHAPE;

    @JSONField(name = "TS")
    private String TS;

    @JSONField(name = "NT")
    private String NT;
}
