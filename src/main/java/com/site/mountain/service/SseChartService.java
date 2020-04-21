package com.site.mountain.service;

import com.site.mountain.entity.SseChart;

import java.util.List;

public interface SseChartService {
    /**
     * 查询采集LineChart数据
     *
     * @param type
     * @return
     */
    List<SseChart> findCollectionChart(String type);

    List<SseChart> findPie(String type);

}
