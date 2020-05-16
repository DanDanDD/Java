package dan.service;

import dan.mapper.CommentMapper;
import dan.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/5/9 17:39
 */

@Service
public class CommentService {
    @Autowired
    private CommentMapper commentMapper;

    public List<Comment> queryComments(Long id) {
        return commentMapper.queryComments(id);
    }

    public int insert(Comment comment) {
        return commentMapper.insert(comment);
    }
}
