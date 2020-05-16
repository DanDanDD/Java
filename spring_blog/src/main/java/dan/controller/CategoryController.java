package dan.controller;

import dan.model.Category;
import dan.model.User;
import dan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * @author: Dennis
 * @date: 2020/5/9 21:10
 */

@Controller
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/c/add", method = RequestMethod.POST)
    public String addCategory(HttpSession session, Category category){
        User user = (User) session.getAttribute("user");
        category.setUserId(user.getId());
        int num = categoryService.insert(category);
        return "redirect:/writer";

    }

}
