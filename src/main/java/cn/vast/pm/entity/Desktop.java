package cn.vast.pm.entity;

import java.util.Date;

public class Desktop {
    /** 桌面应用程序ID */
    private long did;
    /** 桌面应用程序名称 */
    private String desktopName;
    /** 登录账号 */
    private String login;
    /** 登录密码 */
    private String password;
    /** 上次更新时间 */
    private Date lastUpdate;

    public Desktop(long did, String desktopName, String login, String password) {
        this.did = did;
        this.desktopName = desktopName;
        this.login = login;
        this.password = password;
    }

    public long getDid() {
        return did;
    }

    public void setDid(long did) {
        this.did = did;
    }

    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
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

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "did=" + did +
                ", desktopName='" + desktopName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
