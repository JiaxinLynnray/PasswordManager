package cn.vast.pm.dao;

import cn.vast.pm.entity.User;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/30
 */
public interface UserDAO {
    /**
     * 登录
     *
     * @param user 登录账号
     *
     * @return 登陆成功返回对应用户，登录失败返回null
     */
    public User login(User user);
}
