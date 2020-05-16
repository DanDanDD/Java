package dan.service;

import dan.mapper.CategoryMapper;
import dan.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: Dennis
 * @date: 2020/5/9 20:13
 */

@Service
public class CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoriesByUserId(Long id) {
        return categoryMapper.queryCategoriesByUserId(id);
    }

    public int insert(Category category) {
        return categoryMapper.insert(category);
    }

    public Category queryCategoryById(Long id) {
        return categoryMapper.selectByPrimaryKey(id);
    }
}
