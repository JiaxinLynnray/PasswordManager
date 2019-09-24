package cn.vast.pm.entity;

import java.util.Date;

public class Website {
    /** 网站ID */
    private long websiteId;
    /** 网站名称 */
    private String websiteName;
    /** 网站地址 */
    private String websiteUrl;
    /** 登录账号 */
    private String login;
    /** 登录密码 */
    private String password;
    /** 上次更新时间 */
    private Date lastUpdate;

    public Website(long websiteId, String websiteName, String websiteUrl, String login, String password) {
        this.websiteId = websiteId;
        this.websiteName = websiteName;
        this.websiteUrl = websiteUrl;
        this.login = login;
        this.password = password;
    }

    public long getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(long websiteId) {
        this.websiteId = websiteId;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
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
        return "Website{" +
                "websiteId=" + websiteId +
                ", websiteName='" + websiteName + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
