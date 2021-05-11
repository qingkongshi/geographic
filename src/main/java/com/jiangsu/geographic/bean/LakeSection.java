package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-05-10 14:39:35
 * @version: 1.0
 * @describe:
 */
@Data
public class LakeSection {

    private Integer id;

    @JSONField(name = "LKSCT_CD")
    private String LKSCT_CD;

    @JSONField(name = "LKSCT_NM")
    private String LKSCT_NM;

    @JSONField(name = "LKSCT_G")
    private String LKSCT_G;

    @JSONField(name = "LKSCT_A")
    private Double LKSCT_A;

    @JSONField(name = "LK_CD")
    private String LK_CD;

    @JSONField(name = "AD_CD")
    private String AD_CD;

    @JSONField(name = "RV_MST_CD")
    private String RV_MST_CD;

    @JSONField(name = "FA_LKSCT_CD")
    private String FA_LKSCT_CD;

    @JSONField(name = "MID_LN")
    private Double MID_LN;

    @JSONField(name = "MID_LT")
    private Double MID_LT;

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
