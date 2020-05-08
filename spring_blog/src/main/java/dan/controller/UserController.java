package dan.controller;

import dan.model.User;
import dan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: Dennis
 * @date: 2020/5/8 20:39
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/login")
    public String login(String username, String password, HttpServletRequest request){
        // 用户名/密码校验，省略，只做空的判断，跳转到 Login 页面，校验通过，跳转首页
        if (username == null || password == null) {
            return "login";
        }
        User user = userService.login(username,password);

        if (user == null){
            return "login";
        }else {
            HttpSession session = request.getSession();
            session.setAttribute("user",user);
            return "/";
        }

    }
}
