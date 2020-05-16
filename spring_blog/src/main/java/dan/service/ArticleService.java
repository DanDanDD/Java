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

    // mapper 需要加上 @Mapper，Mybatis才能将 Mapper注册到 Spring容器中
    @Autowired
    private ArticleMapper articleMapper;

    public List<Article> queryArticles() {
        return articleMapper.selectAll();
    }

    public Article queryArticles(Long id) {
        return articleMapper.selectByPrimaryKey(id);
    }

    public List<Article> queryArticlesByUserId(Long id) {
        return articleMapper.queryArticlesByUserId(id);
    }

    public int insert(Article article) {
        return articleMapper.insert(article);
    }


    public int updateByCondition(Article article) {
        return articleMapper.updateByCondition(article);
    }
}
