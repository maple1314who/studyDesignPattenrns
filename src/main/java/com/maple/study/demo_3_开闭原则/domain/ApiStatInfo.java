package com.maple.study.demo_3_开闭原则.domain;

/**
 * @author caihao
 * @create 2025-02-11 21:20
 */
public class ApiStatInfo {

    private String api;

    private long requestCount;

    private long errorCount;

    private long durationOfSeconds;


    public ApiStatInfo() {
    }

    public ApiStatInfo(String api, long requestCount, long errorCount, long durationOfSeconds) {
        this.api = api;
        this.requestCount = requestCount;
        this.errorCount = errorCount;
        this.durationOfSeconds = durationOfSeconds;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getDurationOfSeconds() {
        return durationOfSeconds;
    }

    public void setDurationOfSeconds(long durationOfSeconds) {
        this.durationOfSeconds = durationOfSeconds;
    }
}
