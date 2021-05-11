package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-05-10 14:29:29
 * @version: 1.0
 * @describe:
 */
@Data
public class Lake {
    private Integer id;

    @JSONField(name = "LK_CD")
    private String LK_CD;

    @JSONField(name = "LK_NM")
    private String LK_NM;

    @JSONField(name = "LOC")
    private String LOC;

    @JSONField(name = "LK_ALS")
    private String LK_ALS;

    @JSONField(name = "CRO_TP")
    private Integer CRO_TP;

    @JSONField(name = "CRO_AD_CD")
    private String CRO_AD_CD;

    @JSONField(name = "WAT_A")
    private Double WAT_A;

    @JSONField(name = "AVG_DEP")
    private Double AVG_DEP;

    @JSONField(name = "MAX_DEP")
    private Double MAX_DEP;

    @JSONField(name = "LK_V")
    private Double LK_V;

    @JSONField(name = "BAS_CD")
    private String BAS_CD;

    @JSONField(name = "SHAPE")
    private String SHAPE;

    @JSONField(name = "TS")
    private String TS;

    @JSONField(name = "NT")
    private String NT;
}
