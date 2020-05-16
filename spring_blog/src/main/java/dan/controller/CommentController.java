package dan.controller;

import dan.model.Comment;
import dan.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * @author: Dennis
 * @date: 2020/5/9 19:14
 */

@Controller
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/a/{id}/comments",method = RequestMethod.POST)
    public String addComment(@PathVariable("id") Long id, String content){
        Comment comment = new Comment();
        comment.setArticleId(id);
        comment.setContent(content);
        comment.setCreatedAt(new Date());
        int num = commentService.insert(comment);
        return "redirect:/a/"+id;
        // springMVC 重定向写法
    }
}
