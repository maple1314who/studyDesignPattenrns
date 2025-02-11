package com.maple.study.demo_3_开闭原则.domain;

/**
 * @author caihao
 * @create 2025-02-11 21:17
 */

/**
 * 告警规则
 */
public class AlertRule {
    private String api;

    private int maxTps;

    private int maxErrorRate;

    public AlertRule(String api, int maxTps, int maxErrorRate) {
        this.api = api;
        this.maxTps = maxTps;
        this.maxErrorRate = maxErrorRate;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public int getMaxTps() {
        return maxTps;
    }

    public void setMaxTps(int maxTps) {
        this.maxTps = maxTps;
    }

    public int getMaxErrorRate() {
        return maxErrorRate;
    }

    public void setMaxErrorRate(int maxErrorRate) {
        this.maxErrorRate = maxErrorRate;
    }
}
