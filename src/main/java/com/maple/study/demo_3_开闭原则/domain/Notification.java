package com.maple.study.demo_3_开闭原则.domain;

/**
 * @author caihao
 * @create 2025-02-11 21:18
 */

/**
 * 通知
 * @author maple
 */
public class Notification {
    private String subject;

    private String message;

    private String url;

    public Notification(String subject, String message, String url) {
        this.subject = subject;
        this.message = message;
        this.url = url;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void notify(String message) {
        // 实现具体的通知逻辑，比如发送邮件、短信等
        System.out.println("通知: " + message);
    }
}
