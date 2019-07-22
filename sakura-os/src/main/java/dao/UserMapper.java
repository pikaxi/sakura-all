package dao;

import model.User;
import org.apache.ibatis.annotations.Param;

/**
 * /**
 *
 * @author chenjia.zheng
 * @version 1.0
 * @Description:
 * @date 2019/7/22
 */
public interface UserMapper {
    User getUser(@Param("userName") String userName,
                 @Param("password") String password);
}
