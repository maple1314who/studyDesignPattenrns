package com.maple.study.demo_3_开闭原则.service;

import com.maple.study.demo_3_开闭原则.domain.AlertHandler;
import com.maple.study.demo_3_开闭原则.domain.AlertRule;
import com.maple.study.demo_3_开闭原则.domain.ApiStatInfo;
import com.maple.study.demo_3_开闭原则.domain.Notification;

/**
 * @author caihao
 * @create 2025-02-11 21:32
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        // 计算每秒请求数（TPS）
        double tps = (double) apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
        // 假设 AlertRule 中有一个方法 getMaxTps() 来获取最大 TPS 阈值
        if (tps > getRule().getMaxTps()) {
            // 发出警报
            getNotification().notify("API TPS 过高: " + apiStatInfo.getApi());
        }
    }
}
