package com.maple.study.demo_3_开闭原则.domain;

/**
 * @author caihao
 * @create 2025-02-11 21:23
 */
public abstract class AlertHandler {

    private AlertRule rule;
    private Notification notification;


    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public AlertRule getRule() {
        return rule;
    }

    public void setRule(AlertRule rule) {
        this.rule = rule;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
