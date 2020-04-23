package dan.controller;

import dan.model.Duck;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Dennis
 * @date: 2020/4/22 17:23
 */

@Controller
public class LoginController {
// 校验用户名和密码，校验通过，设置用户身份信息到 session
    @RequestMapping("/login")
    @ResponseBody
    public Duck login(String username, String password){
        System.out.printf("username = %s, password = %s\n",username,password);
        return new Duck("LadyGaga",12);
    }

    @RequestMapping("/login2")
    public String login2(){
        return "login.html";
    }
}
