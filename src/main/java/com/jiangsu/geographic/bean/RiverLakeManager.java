package com.jiangsu.geographic.bean;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author： KeA
 * @date： 2021-05-10 15:08:59
 * @version: 1.0
 * @describe:
 */
@Data
public class RiverLakeManager {
    private Integer id;

    @JSONField(name ="RV_MST_CD")
    private String RV_MST_CD;

    @JSONField(name ="RV_MST_NM")
    private String RV_MST_NM;

    @JSONField(name ="AD_CD")
    private String AD_CD;

    @JSONField(name ="GM_TP")
    private String GM_TP;

    @JSONField(name ="POSITION")
    private String POSITION;

    @JSONField(name ="ORG_NM")
    private String ORG_NM;

    @JSONField(name ="TEL")
    private String TEL;

    @JSONField(name ="MOBILE")
    private String MOBILE;

    @JSONField(name ="EMAIL")
    private String EMAIL;

    @JSONField(name ="WETCHAT")
    private String WETCHAT;

    @JSONField(name ="QQ")
    private String QQ;

    @JSONField(name ="CARD_ID")
    private String CARD_ID;

    @JSONField(name ="AD_LV")
    private String AD_LV;

    @JSONField(name ="TASK")
    private String TASK;

    @JSONField(name ="ORDER_ID")
    private Integer ORDER_ID;

    @JSONField(name ="ANN_LEN")
    private Double ANN_LEN;

    @JSONField(name ="TS")
    private String TS;

    @JSONField(name ="NT")
    private String NT;
}
