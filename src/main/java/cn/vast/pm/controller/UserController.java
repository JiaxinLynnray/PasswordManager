package cn.vast.pm.controller;

import cn.vast.pm.entity.User;
import cn.vast.pm.service.UserService;
import cn.vast.pm.util.MD5Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Lynnray
 * @version 1.0
 * @date 2019/10/30
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 登录
     *
     * @param user
     *
     * @return
     */
    @RequestMapping("/login")
    public String login(User user, HttpServletRequest request) {
        if (user.getPassword() != null) {
            String md5Pwd = MD5Util.md5Encode(user.getPassword(), "UTF-8");
            user.setPassword(md5Pwd);
        } else {
            user.setPassword("");
        }

        User resultUser = userService.login(user);
        if (resultUser == null) {
            request.setAttribute("user", user);
            request.setAttribute("errorMsg", "请认真核对账号、密码！");
            return "login";
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            return "redirect:/index.jsp";
        }
    }
}
