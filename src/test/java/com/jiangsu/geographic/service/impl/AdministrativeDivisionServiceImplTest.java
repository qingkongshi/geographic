package com.jiangsu.geographic.service.impl;

import com.jiangsu.geographic.service.AdministrativeDivisionService;
import com.jiangsu.geographic.service.ReportService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author： KeA
 * @date： 2021-05-09 21:03:21
 * @version: 1.0
 * @describe:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class AdministrativeDivisionServiceImplTest {

    @Autowired
    private AdministrativeDivisionService administrativeDivisionService;

    @Autowired
    private ReportService reportService;

    @Test
    void test() {
        // 行政区划
        reportService.reportAdministrative();
        // 湖泊
        reportService.reportLake();
        // 湖段
        reportService.reportLakeSection();
        // 河段
        reportService.reportReach();
        // 水库
        reportService.reportReservoir();
        // 河湖长
        reportService.reportRiverLakeManager();
    }
}