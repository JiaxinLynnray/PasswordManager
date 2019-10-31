package cn.vast.pm.entity;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/30
 */
public class User {
    /** 用户ID */
    private long userId;
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
    /** 昵称 */
    private String nickName;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
