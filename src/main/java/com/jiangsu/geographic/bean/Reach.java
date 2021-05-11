package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-05-10 14:54:37
 * @version: 1.0
 * @describe:
 */
@Data
public class Reach {
    private Integer id;

    @JSONField(name = "RVSCT_CD")
    private String RVSCT_CD;

    @JSONField(name = "RVSCT_NM")
    private String RVSCT_NM;

    @JSONField(name = "RVSCT_ALS")
    private String RVSCT_ALS;

    @JSONField(name = "RVSCT_LEN")
    private Double RVSCT_LEN;

    @JSONField(name = "RV_CD")
    private String RV_CD;

    @JSONField(name = "AD_CD")
    private String AD_CD;

    @JSONField(name = "FA_RVSCT_CD")
    private String FA_RVSCT_CD;

    @JSONField(name = "RV_MST_CD")
    private String RV_MST_CD;

    @JSONField(name = "ST_LOC")
    private String ST_LOC;

    @JSONField(name = "END_LOC")
    private String END_LOC;

    @JSONField(name = "ST_LN")
    private Double ST_LN;

    @JSONField(name = "ST_LT")
    private Double ST_LT;

    @JSONField(name = "END_LN")
    private Double END_LN;

    @JSONField(name = "END_LT")
    private Double END_LT;

    @JSONField(name = "ST_ADCD")
    private String ST_ADCD;

    @JSONField(name = "END_ADCD")
    private String END_ADCD;

    @JSONField(name = "BANK")
    private Integer BANK;

    @JSONField(name = "GEO_TP")
    private Integer GEO_TP;

    @JSONField(name = "SHAPE")
    private String SHAPE;

    @JSONField(name = "OVERVIEW")
    private String OVERVIEW;

    @JSONField(name = "TS")
    private String TS;

    @JSONField(name = "NT")
    private String NT;
}
