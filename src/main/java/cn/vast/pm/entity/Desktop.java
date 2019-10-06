package cn.vast.pm.entity;

import java.util.Date;

/**
 * @author Lynnray
 * @date 2019/9/25 21:25
 * @version 1.0
 */
public class Desktop {
    /** 桌面应用程序ID */
    private Long desktopId;
    /** 桌面应用程序名称 */
    private String desktopName;
    /** 登录账号 */
    private String loginName;
    /** 登录密码 */
    private String password;
    /** 上次更新时间 */
    private Date lastUpdate;

    public Desktop(String desktopName, String loginName, String password) {
        this.desktopName = desktopName;
        this.loginName = loginName;
        this.password = password;
    }

    public Long getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(Long desktopId) {
        this.desktopId = desktopId;
    }

    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "desktopId=" + desktopId +
                ", desktopName='" + desktopName + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
