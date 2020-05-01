package frank.controller;

import frank.model.User;
import frank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: Dennis
 * @date: 2020/4/30 18:27
 */

@Controller
@RequestMapping("/user2")
public class User2Controller {

    @Autowired
    private UserService userService;

    @RequestMapping("/insert")
    @ResponseBody
    public User insert(User user){
        int num = userService.insert(user);
        return user;

    }
}
