package com.stringee.stringeeflutterplugin.notification;

public class NotificationAction {
    private String id;
    private String icon;
    private int sourceFrom;
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getSourceFrom() {
        return sourceFrom;
    }

    public void setSourceFrom(int sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
