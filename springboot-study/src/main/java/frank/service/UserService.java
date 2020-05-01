package frank.service;

import frank.mapper.UserMapper;
import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: Dennis
 * @date: 2020/4/30 18:26
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public int insert(User user) {
        return userMapper.insert(user);
    }
}
