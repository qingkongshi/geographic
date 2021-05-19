package com.jiangsu.geographic.controller;

import com.jiangsu.geographic.service.ReportService;
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

    @RequestMapping("report1")
    public Map report1(){
        return reportService.reportAdministrative();
    }

    @RequestMapping("report2")
    public Map report2(){
        return reportService.reportLake();
    }

    @RequestMapping("report3")
    public Map report3(){
        return reportService.reportReservoir();
    }

    @RequestMapping("report4")
    public Map report4(){
        return reportService.reportReach();
    }

    @RequestMapping("report5")
    public Map report5(){
        return reportService.reportLakeSection();
    }

    @RequestMapping("report6")
    public Map report6(){
        return reportService.reportRiverLakeManager();
    }
}
