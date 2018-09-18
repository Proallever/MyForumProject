package com.stgh.forum.Controller;

import com.stgh.forum.pojo.User;
import com.stgh.forum.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/Forum")
public class UserController {

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public ModelAndView welcome(){
        return new ModelAndView("welcome");
    }
    @RequestMapping("/signUpForUser")
    public ModelAndView signUp(){
        return new ModelAndView("signUpForUser");
    }
    @RequestMapping("/homePage")
    public ModelAndView homePage(){
        return new ModelAndView("homePage");
    }
    @RequestMapping("/updateUserPage")
    public ModelAndView updateUserPage(){ return new ModelAndView("updateUser");}
    @RequestMapping("/newPostPage")
    public ModelAndView newPostPage(){ return new ModelAndView("newPost");}

    @RequestMapping("/signUp")
    public String add(@RequestBody User user){
        if(userService.checkUserName(user)==0){
            return "用户名已被注册";
        }else {
            userService.addUser(user);
            return "注册成功";
        }
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public User login(@RequestBody User user){
        System.out.print("user" + user);
        return userService.login(user);
        //return user;
    }

    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user){
        return userService.update(user);
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(Integer uid){
        return userService.delete(uid);
    }
}
