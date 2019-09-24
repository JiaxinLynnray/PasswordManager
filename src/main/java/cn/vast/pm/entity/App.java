package cn.vast.pm.entity;

import java.util.Date;

public class App {
    /** APP ID */
    private long appId;
    /** APP名称 */
    private String appName;
    /** 登录账号 */
    private String login;
    /** 登录密码 */
    private String password;
    /** 登录类型 */
    private int loginType;
    /** 上次更新时间 */
    private Date lastUpdate;

    public App(long appId, String appName, String login, String password, int loginType) {
        this.appId = appId;
        this.appName = appName;
        this.login = login;
        this.password = password;
        this.loginType = loginType;
    }

    public long getAppId() {
        return appId;
    }

    public void setAppId(long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "App{" +
                "appId=" + appId +
                ", appName='" + appName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", loginType=" + loginType +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
