package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-05-10 15:01:31
 * @version: 1.0
 * @describe:
 */
@Data
public class Reservoir {

    private Integer id;

    @JSONField(name  ="RES_CD")
    private String RES_CD;

    @JSONField(name  ="RES_NM")
    private String RES_NM;

    @JSONField(name  ="RES_ALS")
    private String RES_ALS;

    @JSONField(name  ="AD_CD")
    private String AD_CD;

    @JSONField(name  ="RV_CD")
    private String RV_CD;

    @JSONField(name  ="RV_MST_CD")
    private String RV_MST_CD;

    @JSONField(name  ="IF_REG")
    private Integer IF_REG;

    @JSONField(name  ="REG_NO")
    private String REG_NO;

    @JSONField(name  ="LOC")
    private String LOC;

    @JSONField(name  ="ENG_G")
    private Integer ENG_G;

    @JSONField(name  ="ENG_SCAL")
    private Integer ENG_SCAL;

    @JSONField(name  ="CAT_A")
    private Double CAT_A;

    @JSONField(name  ="DES_FZ")
    private Double DES_FZ;

    @JSONField(name  ="TOT_V")
    private Double TOT_V;

    @JSONField(name  ="FIVTG_V")
    private Double FIVTG_V;

    @JSONField(name  ="NORM_WZ")
    private Double NORM_WZ;

    @JSONField(name  ="CF_Z")
    private String CF_Z;

    @JSONField(name  ="UTIL_V")
    private Double UTIL_V;

    @JSONField(name  ="FS_Z")
    private Double FS_Z;

    @JSONField(name  ="FS_Z_V")
    private Double FS_Z_V;

    @JSONField(name  ="DEAD_Z")
    private Double DEAD_Z;

    @JSONField(name  ="DEAD_Z_V")
    private Double DEAD_Z_V;

    @JSONField(name  ="RES_REG_TP")
    private String RES_REG_TP;

    @JSONField(name  ="ENG_STAT")
    private Integer ENG_STAT;

    @JSONField(name  ="ST_DT")
    private String ST_DT;

    @JSONField(name  ="COM_DT")
    private String COM_DT;

    @JSONField(name  ="ADM_DEP")
    private Integer ADM_DEP;

    @JSONField(name  ="SHAPE")
    private String SHAPE;

    @JSONField(name  ="TS")
    private String TS;

    @JSONField(name  ="NT")
    private String NT;
}
