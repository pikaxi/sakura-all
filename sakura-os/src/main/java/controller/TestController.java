package controller;

import common.Result;
import model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
@Controller
public class TestController {
    @Resource
    private UserService userService;
    /*@RequestMapping("/test")
    public String test(){
        return "test";
    }*/
    private Logger logger = Logger.getLogger ( TestController.class );
    @RequestMapping ( value = "/check", method = RequestMethod.POST )
    @ResponseBody
    @CrossOrigin
    public Result check () {
        logger.info("MainController run");
        Result result = new Result();
        result.setMessage("SSM vue前后端框架搭建成功");
        return result;
    }

    @RequestMapping ( value = "/checkUser", method = RequestMethod.POST )
    @ResponseBody
    @CrossOrigin
    public Result checkUser (User user) {
        logger.info("test checkUser");
        Result result = new Result();
        if(userService.getUser(user.getUserName(),user.getPassword())!=null){
            result.setMessage("登录成功");
        }else{
            result.setMessage("登录失败");
        }
        return result;
    }
}
