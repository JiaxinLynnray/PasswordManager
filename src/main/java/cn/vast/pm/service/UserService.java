package cn.vast.pm.service;

import cn.vast.pm.entity.User;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/30
 */
public interface UserService {
    /**
     * 登录
     *
     * @param user
     *
     * @return
     */
    public User login(User user);
}
