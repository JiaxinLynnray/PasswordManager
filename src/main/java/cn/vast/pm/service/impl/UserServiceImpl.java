package cn.vast.pm.service.impl;

import cn.vast.pm.dao.UserDAO;
import cn.vast.pm.entity.User;
import cn.vast.pm.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/30
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDAO userDAO;


    @Override
    public User login(User user) {
        return userDAO.login(user);
    }
}
