package dan.service;

import dan.mapper.ArticleMapper;
import dan.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/5/8 19:14
 */

@Service
public class ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> queryArticles() {
        return articleMapper.selectAll();
    }

    public Article queryArticles(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }
}
