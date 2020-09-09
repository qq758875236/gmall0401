package com.aiguigu.gmall0401.user.service;

import com.aiguigu.gmall0401.user.bean.UserInfo;

import java.util.List;

public interface UserService {

    //查询所有user
    List<UserInfo> getUserInfoListAll();
    //添加用户
    void addUser(UserInfo userInfo);
    //修改用户
    void updateUser(UserInfo userInfo);
    //按名称修改用户
    void updateUserByName(String name,UserInfo userInfo);
    //删除用户
    void delUser(UserInfo userInfo);
    //根据id 去查
    UserInfo getUserInfoById(String id);


}
