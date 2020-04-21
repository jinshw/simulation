package com.site.mountain.service.impl;

import com.site.mountain.dao.mysql.SseChartDao;
import com.site.mountain.entity.SseChart;
import com.site.mountain.service.SseChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SseChartServiceImpl implements SseChartService {

    @Autowired
    private SseChartDao sseChartDao;

    @Override
    public List<SseChart> findCollectionChart(String type) {
        List<SseChart> list = new ArrayList<>();
        switch (type) {
            case "collection":
                list = sseChartDao.findCollectionChart(0);
                break;
            case "progress":
                list = sseChartDao.findProgressChart(0);
                break;
            case "scene":
                list = sseChartDao.findSceneChart(0);
                break;
            case "audit":
                list = sseChartDao.findAuditChart(0);
                break;
        }
        return list;
    }

    public List<SseChart> findPie(String type) {
        List<SseChart> list = new ArrayList<>();
        switch (type) {
            case "collection":
                list = sseChartDao.findPieCollection(0);
                break;
            case "progress":
                break;
            case "scene":
                list = sseChartDao.findPieScene(0);
                break;
            case "audit":
                break;
        }
        return list;
    }
}
