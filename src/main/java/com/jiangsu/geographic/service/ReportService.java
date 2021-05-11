package com.jiangsu.geographic.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.jiangsu.geographic.bean.*;
import com.jiangsu.geographic.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * @author： KeA
 * @date： 2021-05-10 17:15:24
 * @version: 1.0
 * @describe:
 */
@Service
public class ReportService {
    @Autowired
    private AdministrativeDivisionMapper administrativeDivisionMapper;

    @Autowired
    private LakeMapper lakeMapper;

    @Autowired
    private LakeSectionMapper lakeSectionMapper;

    @Autowired
    private ReachMapper reachMapper;

    @Autowired
    private ReservoirMapper reservoirMapper;

    @Autowired
    private RiverLakeManagerMapper riverLakeManagerMapper;

    @Autowired
    private RestTemplate restTemplate;

    final String baseUrl = "http://localhost/code";

    /**
     * 行政区划
     */
    public void reportAdministrative(){
        String url = baseUrl+"/HZZ_AD_B/bulk";
        // 获取数据
        List<AdministrativeDivision> list = administrativeDivisionMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }

    /**
     * 湖泊
     */
    public void reportLake(){
        String url = baseUrl+"/hzz_lk_b/bulk";
        // 获取数据
        List<Lake> list = lakeMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }

    /**
     * 湖段
     */
    public void reportLakeSection(){
        String url = baseUrl + "/hzz_lksct_b/bulk";
        // 获取数据
        List<LakeSection> list = lakeSectionMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }

    /**
     * 河段
     */
    public void reportReach(){
        String url = baseUrl + "/hzz_rvsct_b/bulk";
        // 获取数据
        List<Reach> list = reachMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }

    /**
     * 水库
     */
    public void reportReservoir(){
        String url = baseUrl + "/hzz_res_b/bulk";
        // 获取数据
        List<Reservoir> list = reservoirMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }

    /**
     * 河湖长
     */
    public void reportRiverLakeManager(){
        String url = baseUrl + "/hzz_rvmst_b/bulk";
        // 获取数据
        List<RiverLakeManager> list = riverLakeManagerMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
    }
}
