package com.maple.study.demo_3_开闭原则.service;

import com.maple.study.demo_3_开闭原则.domain.AlertHandler;
import com.maple.study.demo_3_开闭原则.domain.AlertRule;
import com.maple.study.demo_3_开闭原则.domain.ApiStatInfo;
import com.maple.study.demo_3_开闭原则.domain.Notification;

/**
 * @author caihao
 * @create 2025-02-11 21:33
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        // 获取错误率
        double errorRate = (double) apiStatInfo.getErrorCount() / apiStatInfo.getRequestCount();
        // 假设 AlertRule 中有一个方法 getMaxErrorRate() 来获取最大错误率阈值
        if (errorRate > getRule().getMaxErrorRate()) {
            // 发出警报
            getNotification().notify("API 错误率过高: " + apiStatInfo.getApi());
        }
    }
}
