package com.maple.study.demo_3_开闭原则.domain;

/**
 * @author caihao
 * @create 2025-02-11 21:29
 */

import com.maple.study.demo_3_开闭原则.service.ErrorAlertHandler;
import com.maple.study.demo_3_开闭原则.service.TpsAlertHandler;

/**
 * 负责创建和组装对象之间的依赖关系
 * @author maple
 */
public class ApplicationContext {

    private AlertRule alertRule;

    private Notification notification;

    private Alert alert;

    public void initializeBeans(){
        alertRule = new AlertRule("11",2,3);
        notification = new Notification("1","22","11");
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule, notification));
    }

    private static final ApplicationContext INSTANCE = new ApplicationContext();
    private ApplicationContext() {
        INSTANCE.initializeBeans();
    }

    public static ApplicationContext getInstance(){
        return INSTANCE;
    }

    public AlertRule getAlertRule() {
        return alertRule;
    }

    public void setAlertRule(AlertRule alertRule) {
        this.alertRule = alertRule;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public Alert getAlert() {
        return alert;
    }

    public void setAlert(Alert alert) {
        this.alert = alert;
    }
}
