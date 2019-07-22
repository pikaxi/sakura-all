package service.impl;

import dao.UserMapper;
import model.User;
import org.springframework.stereotype.Service;
import service.UserService;

import javax.annotation.Resource;

/**
 * /**
 *
 * @author chenjia.zheng
 * @version 1.0
 * @Description:
 * @date 2019/7/22
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getUser(String userName, String password) {
        return userMapper.getUser(userName,password);
    }
}
