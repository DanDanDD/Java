package dan.controller;

import dan.model.Article;
import dan.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/5/8 19:09
 */

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/")
    public String index(Model model){
        // 用户登录以后，user对象需要从session获取，并设置页面需要的属性中
        List<Article> articles = articleService.queryArticles();
        model.addAttribute("articleList",null);
        return "index";
    }

    @RequestMapping("/a/{id}")
    public String detail(@PathVariable("id") Long id){
        Article article = articleService.queryArticles(id);
        model.addAttribute()
    }
}
