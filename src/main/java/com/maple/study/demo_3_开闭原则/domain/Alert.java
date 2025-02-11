package com.maple.study.demo_3_开闭原则.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author caihao
 * @create 2025-02-11 21:17
 */
public class Alert {

    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }



}
