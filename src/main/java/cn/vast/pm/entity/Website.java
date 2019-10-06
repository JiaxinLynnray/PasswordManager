package cn.vast.pm.entity;

import java.util.Date;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/9/25 21:29
 */
public class Website {
    /** 网站ID */
    private Long websiteId;
    /** 网站名称 */
    private String websiteName;
    /** 网站地址 */
    private String websiteUrl;
    /** 登录账号 */
    private String loginName;
    /** 登录密码 */
    private String password;
    /** 上次更新时间 */
    private Date lastUpdate;

    public Website(String websiteName, String websiteUrl, String loginName, String password) {
        this.websiteName = websiteName;
        this.websiteUrl = websiteUrl;
        this.loginName = loginName;
        this.password = password;
    }

    public Long getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Long websiteId) {
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
        return "Website{" +
                "websiteId=" + websiteId +
                ", websiteName='" + websiteName + '\'' +
                ", websiteUrl='" + websiteUrl + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
