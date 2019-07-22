package service;

import model.User;

/**
 * /**
 *
 * @author chenjia.zheng
 * @version 1.0
 * @Description:
 * @date 2019/7/22
 */
public interface UserService {
    User getUser(String userName,String password);
}
