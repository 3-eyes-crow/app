package com.xqq.app.controller;

import com.xqq.app.domain.Users;
import com.xqq.app.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DataController {

    @Autowired
    DataService dataService;

    @RequestMapping("index")
    public String index(){
        return "test";
    }

    @RequestMapping("list")
    @ResponseBody
    public List<Users> list(){
        return dataService.listUsers();
    }

    @RequestMapping("saveUser")
    @ResponseBody
    public String saveUser(Users user){
        if(dataService.saveUser(user) > 0) {
            return "{\"success\":true}";
        } else {
            return "{\"msg\":\"error\"}";
        }
    }

    @RequestMapping("updateUser")
    @ResponseBody
    public String updateUser(Users user){
        if(dataService.updateUser(user) > 0) {
            return "{\"success\":true}";
        } else {
            return "{\"msg\":\"error\"}";
        }
    }
    @RequestMapping("deleteUser")
    @ResponseBody
    public String deleteUser(String id){
        if(dataService.deleteUser(id) > 0) {
            return "{\"success\":true}";
        } else {
            return "{\"msg\":\"error\"}";
        }
    }

}
