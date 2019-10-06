package cn.vast.pm.entity;

import java.util.Date;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/25 21:29
 */
public class App {
    /** APP ID */
    private Long appId;
    /** APP名称 */
    private String appName;
    /** 登录账号 */
    private String loginName;
    /** 登录密码 */
    private String password;
    /** 登录类型 */
    private Integer loginType;
    /** 上次更新时间 */
    private Date lastUpdate;

    public App(String appName, String loginName, String password, Integer loginType) {
        this.appName = appName;
        this.loginName = loginName;
        this.password = password;
        this.loginType = loginType;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getLoginType() {
        return loginType;
    }

    public void setLoginType(Integer loginType) {
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
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", loginType=" + loginType +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
