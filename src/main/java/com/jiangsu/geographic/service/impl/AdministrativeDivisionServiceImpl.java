package com.jiangsu.geographic.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jiangsu.geographic.bean.AdministrativeDivision;
import com.jiangsu.geographic.mapper.AdministrativeDivisionMapper;
import com.jiangsu.geographic.service.AdministrativeDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author： KeA
 * @date： 2021-05-09 21:02:05
 * @version: 1.0
 * @describe:
 */
@Service
public class AdministrativeDivisionServiceImpl implements AdministrativeDivisionService {

    @Autowired(required = false)
    private AdministrativeDivisionMapper administrativeDivisionMapper;

    @Override
    public void report() {
        String url = "http://localhost/code/HZZ_AD_B/bulk";
        RestTemplate restTemplate = new RestTemplate();
        List<AdministrativeDivision> list = administrativeDivisionMapper.getList();
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }
}
