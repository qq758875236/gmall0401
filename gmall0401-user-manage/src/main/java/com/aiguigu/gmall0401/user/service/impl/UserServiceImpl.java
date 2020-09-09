package com.aiguigu.gmall0401.user.service.impl;

import com.aiguigu.gmall0401.user.bean.UserInfo;
import com.aiguigu.gmall0401.user.mapper.UserMapper;
import com.aiguigu.gmall0401.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;


    @Override
    public List<UserInfo> getUserInfoListAll() {

        List<UserInfo> userInfoList =userMapper.selectAll();

        return userInfoList;
    }

    @Override
    public void addUser(UserInfo userInfo) {
        userMapper.insertSelective(userInfo);
    }

    @Override
    public void updateUser(UserInfo userInfo) {
        userMapper.updateByPrimaryKeySelective(userInfo);
    }

    @Override
    public void updateUserByName(String name, UserInfo userInfo) {

        //example修改数据的条件，通过反射去取userInfo 中的属性
        Example example = new Example(UserInfo.class);
        //修改条件是 name=name（传进来的name，等于UserInfo中的属性name）
        example.createCriteria().andEqualTo("name",name);

        userMapper.updateByExampleSelective(userInfo,example);
    }

    @Override
    public void delUser(UserInfo userInfo) {
        userMapper.deleteByPrimaryKey(userInfo.getId());
    }

    @Override
    public UserInfo getUserInfoById(String id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
