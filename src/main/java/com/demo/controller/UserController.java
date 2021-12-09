package com.demo.controller;


import com.demo.common.model.User;
import com.demo.interceptor.LogInterceptor;
import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;
import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;
import com.jfinal.aop.Inject;
import com.jfinal.core.Controller;
import com.jfinal.core.Path;
import com.jfinal.kit.Ret;
import com.jfinal.plugin.activerecord.Db;
import com.jfinal.plugin.activerecord.Record;
import sun.security.util.Password;
import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Before(LogInterceptor.class)
@Path("/user")
public class UserController extends Controller {


    //测试
    public void test1(){
        renderText("===用户测试页111==");
    }

    //获取所有用户信息
    public void list(){
        List<User> all = User.dao.findAll();
        set("us",all);
        render("/user/user.html");
    }


    //根据id查询用户
    @Clear
    public void getUserById(){
        User byId = User.dao.findById(getInt(0));
        renderJson(byId);
    }

    //用户删除
    @Clear
    public void deleUserById(){
        User.dao.deleteById(getInt(0));
        renderJson(Ret.ok());
    }


//    //获取用户
//    public User getUserFromParam(){
//        User user = new User();
//        String name = getPara("name");
//        if (name ==null || name.equals("")){
//            return user;
//        }
//        user.setName(name);
//        String password = getPara("password");
//        if (password == null || name.equals("")){
//            return user;
//        }
//        user.setPassword(password);
//        return user;
//    }
}
