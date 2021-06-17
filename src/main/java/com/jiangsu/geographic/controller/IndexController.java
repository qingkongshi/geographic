package com.jiangsu.geographic.controller;

import com.jiangsu.geographic.service.ReportService;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author： KeA
 * @date： 2021-05-19 10:15:39
 * @version: 1.0
 * @describe:
 */
@RestController
@RequestMapping
public class IndexController {
    @Autowired
    private ReportService reportService;

//    @RequestMapping("report1")
//    public Map report1(){
//        return reportService.reportAdministrative();
//    }
    @RequestMapping("select1")
    public String select1(String ids){
        return reportService.selectAdmin(ids);
    }


//
//    @RequestMapping("report2")
//    public Map report2(){
//        return reportService.reportLake();
//    }

    @RequestMapping("report3")
    public String report3(Integer page ,Integer pageSize){
        return reportService.reportReservoir(page,pageSize);
    }

    @RequestMapping("select3")
    public String select3(String ids){
        return reportService.selectReservoir(ids);
    }

    @RequestMapping("delete3")
    public void delete3(String ids){
        reportService.deleteReservoir(ids);
    }



    @RequestMapping("report4")
    public String report4(Integer page ,Integer pageSize){
        return reportService.reportReach(page,pageSize);
    }
    @RequestMapping("reportAll4")
    public String reportAll4(Integer page ,Integer pageSize){
        return reportService.reportReachAll(page,pageSize);
    }

    @RequestMapping("select4")
    public String select4(String ids){
        return reportService.selectReach(ids);
    }
    @RequestMapping("delete4")
    public String delete4(String ids){
        return reportService.deleteReach(ids);
    }



    @RequestMapping("report5")
    public String report5(Integer page ,Integer pageSize){
        return reportService.reportLakeSection(page,pageSize);
    }
    @RequestMapping("select5")
    public String select5(String ids){
        return reportService.selectLakeSection(ids);
    }

    @RequestMapping("delete5")
    public void delete5(String ids){
        reportService.deleteLakeSection(ids);
    }




    @RequestMapping("report6")
    public Map report6(Integer page,Integer pageSize){
        return reportService.reportRiverLakeManager(page,pageSize);
    }
    @RequestMapping("select6")
    public String select6(String ids){
        return reportService.selectRiverLakeManager(ids);
    }
    @RequestMapping("delete6")
    public Map delete6(String ids){
        return reportService.deleteRiverLakeManager(ids);
    }
}
