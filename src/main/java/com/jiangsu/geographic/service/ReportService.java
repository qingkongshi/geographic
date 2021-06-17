package com.jiangsu.geographic.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.jiangsu.geographic.bean.*;
import com.jiangsu.geographic.mapper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
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
    private LogMapper logMapper;

    @Autowired
    private RestTemplate restTemplate;

    final String baseUrl = "http://172.19.19.3:14060/HZZ3203A292F0D49F08";
//    final String baseUrl = "http://172.19.19.3:21680/HZZ3203A292F0D49F08";

    /**
     * 行政区划
     */
    public Map reportAdministrative(){
        String url = baseUrl+"/HZZ_AD_B/bulk";
        // 获取数据
        List<AdministrativeDivision> list = administrativeDivisionMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public String selectAdmin(String ids){
        String url = null;
        if(null == ids){
            url = baseUrl + "/HZZ_AD_B";
        }else{
            url = baseUrl + "/HZZ_AD_B/bulk?_ids="+ids;
        }
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        return responseEntity.getBody();
    }

    /**
     * 湖泊
     */
    public Map reportLake(){
        String url = baseUrl+"/HZZ_LK_B/bulk";
        // 获取数据
        List<Lake> list = lakeMapper.getList();
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    /**
     * 水库
     */
    public String reportReservoir(Integer page ,Integer pageSize){
        String url = baseUrl + "/HZZ_RES_B/bulk";
        page = (page - 1)*pageSize;
        // 获取数据
        List<Reservoir> list = reservoirMapper.getList(page,pageSize);
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,array, String.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public String selectReservoir(String ids){
        String url = null;
        if(null == ids){
            url = baseUrl + "/HZZ_RES_B";
        }else{
            url = baseUrl + "/HZZ_RES_B/bulk?_ids="+ids;
        }
        System.out.println(url);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public void deleteReservoir(String ids){
        System.out.println("【要删除的id】："+ids);
        String url = baseUrl + "/HZZ_RES_B/bulk?_ids="+ids;
        restTemplate.delete(url);
    }

    /**
     * 河段
     */
    public String reportReach(Integer page ,Integer pageSize){
        String url = baseUrl + "/HZZ_RVSCT_B/bulk";
        page = (page - 1)*pageSize;
        // 获取数据
        List<Reach> list = reachMapper.getList(page,pageSize);
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,array, String.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }
    public String reportReachAll(Integer page ,Integer pageSize){
        String url = baseUrl + "/HZZ_RVSCT_B/bulk";
        page = (page - 1)*pageSize;
        // 获取数据
        List<Reach> list = reachMapper.getList(page,pageSize);
        List<Reach> list2 = new ArrayList<>();
        for (Reach reach : list){
            // 封装json
            list2.add(reach);
            JSONArray array= JSONArray.parseArray(JSON.toJSONString(list2));
            ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,array, String.class);
            System.out.println(responseEntity);
            logMapper.add(reach.getRVSCT_CD()+":"+responseEntity.toString());
            list2.clear();
            System.out.println("============================================================================");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "已修改："+list.size()+"条";
    }

    public String selectReach(String ids){
        String url = null;
        if(null == ids){
            url = baseUrl + "/HZZ_RVSCT_B";
        }else{
            url = baseUrl + "/HZZ_RVSCT_B/bulk?_ids="+ids;
        }
        System.out.println(url);
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public String deleteReach(String ids){
        System.out.println("【要删除的id】："+ids);
        String url = baseUrl + "/HZZ_RVSCT_B/bulk?_ids="+ids;
        restTemplate.delete(url);
        return "";
    }

    /**
     * 湖段
     */
    public String reportLakeSection(Integer page ,Integer pageSize){
        String url = baseUrl + "/HZZ_LKSCT_B/bulk";
        page = (page - 1)*pageSize;
        // 获取数据
        List<LakeSection> list = lakeSectionMapper.getList(page,pageSize);
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url,array, String.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public String selectLakeSection(String ids){
        String url = null;
        if(null == ids){
            url = baseUrl + "/HZZ_LKSCT_B";
        }else{
            url = baseUrl + "/HZZ_LKSCT_B/bulk?_ids="+ids;
        }
        System.out.println(url);

        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url,String.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public void deleteLakeSection(String ids){
        System.out.println("【要删除的id】："+ids);
        String url = baseUrl + "/HZZ_LKSCT_B/bulk?_ids="+ids;
        restTemplate.delete(url);
    }

    /**
     * 河湖长
     */
    public Map reportRiverLakeManager(Integer page,Integer pageSize){
        String url = baseUrl + "/HZZ_RVMST_B/bulk";
        page = (page - 1)*pageSize;
        // 获取数据
        List<RiverLakeManager> list = riverLakeManagerMapper.getList(page,pageSize);
        System.out.println(list);
        // 封装json
        JSONArray array= JSONArray.parseArray(JSON.toJSONString(list));
        ResponseEntity<Map> responseEntity = restTemplate.postForEntity(url,array, Map.class);
        System.out.println(responseEntity);
        return responseEntity.getBody();
    }

    public void updateAndInsert(){
        List<RiverLakeManager> list = riverLakeManagerMapper.getAllList();
        for (RiverLakeManager riverLakeManager:list){

        }
    }

    public String selectRiverLakeManager(String ids){
        String url = null;
        if (null == ids){
            url = baseUrl + "/HZZ_RVMST_B";
        }else{
            url = baseUrl + "/HZZ_RVMST_B/bulk?_ids="+ids;
        }
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        return responseEntity.getBody();
    }

    public Map deleteRiverLakeManager(String ids){
        System.out.println("【要删除的id】："+ids);
        String url = baseUrl + "/HZZ_RVMST_B/bulk?_ids="+ids;
        restTemplate.delete(url);
        return new HashMap();
    }
}
