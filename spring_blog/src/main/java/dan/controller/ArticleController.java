package dan.controller;

import dan.model.Article;
import dan.model.Category;
import dan.model.Comment;
import dan.model.User;
import dan.service.ArticleService;
import dan.service.CategoryService;
import dan.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/5/8 19:09
 */

@Controller
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @Autowired
    private CommentService commentService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/")
    public String index(Model model){
        // 用户登录以后，user对象需要从session获取，并设置页面需要的属性中
        List<Article> articles = articleService.queryArticles();
        model.addAttribute("articleList",articles);
        return "index";
    }

    @RequestMapping("/a/{id}")
    public String detail(@PathVariable("id") Long id, Model model){
        Article article = articleService.queryArticles(id);
        List<Comment> comments = commentService.queryComments(id);
        article.setCommentList(comments);
        model.addAttribute("article",article);
        return "info";
    }

    @RequestMapping("/writer")
    public String writer(HttpSession session, Long activeCid, Model model){
        User user = (User) session.getAttribute("user");
        List<Article> articles = articleService.queryArticlesByUserId(user.getId());
        model.addAttribute("articleList", articles);
        List<Category> categories = categoryService.queryCategoriesByUserId(user.getId());
        model.addAttribute("categoryList",categories);
        model.addAttribute("activeCid",
                activeCid == null ? categories.get(0).getId() : activeCid);
        return "writer";
    }

    /**
     * 跳转到新建文章/修改文章页面（同一个页面editor）
     * @param type  新增为1 ， 修改为2
     * @param id    新增时为 categoryId ，修改时为 activeCid
     * @param model   editor页面需要 type属性，都需要category，新增时需要activeCid，修改时需要article
     * @return
     */
    @RequestMapping("/writer/forward/{type}/{id}/editor")
    public String editorAdd(@PathVariable("type") Long type,
                            @PathVariable("id") Long id, Model model){
        Category category;
        if(type == 1){ // 完成editor 页面新增的属性设置
            category = categoryService.queryCategoryById(id);
            model.addAttribute("activeCid",id);
        }else { // 完成 editor 页面修改的属性设置
            // 可以一次SQL 查询出 article 和 category数据：
            // Article 定义Category 类型为一个属性，SQL中使用association标签作为查询结果集1对1关联关系

            Article article = articleService.queryArticles(id);
            model.addAttribute("article",article);
            category = categoryService.queryCategoryById(new Long(article.getCategoryId()));

        }
        model.addAttribute("type",type);
        model.addAttribute("category", category);
        return "editor";
    }

    /**
     *
     * @param type  新增为1 ， 修改为2
     * @param id    新增时为 categoryId ，修改时为 activeCid
     * @param article 腹部的文章信息
     * @return
     */
    @RequestMapping(value = "/writer/article/{type}/{id}", method = RequestMethod.POST)
    public String publish(@PathVariable("type") Long type,
                          @PathVariable("id") Integer id, Article article,
                          HttpSession session, Model model){

        article.setUpdatedAt(new Date());
        if (type == 1){ //新增的时候，插入文章数据
            article.setCategoryId(id);
            User user = (User) session.getAttribute("user");
            article.setUserId(user.getId());
            article.setCoverImage("https://picsum.photos/id/1/400/300");
            article.setCreatedAt(new Date());
            article.setStatus((byte)0);
            article.setViewCount(0L);
            article.setCommentCount(0);
            int num = articleService.insert(article);
            id = article.getId().intValue();
        }else { // 修改的时候，修改文章数据
            article.setId(new Long(id));
            int num = articleService.updateByCondition(article);

        }
        return String.format("redirect:/writer/forward/2/%s/editor", id);
    }

}
