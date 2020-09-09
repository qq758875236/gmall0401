package com.aiguigu.gmall0401.user.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data//加构造方法
@NoArgsConstructor//加无参构造函数
public class UserInfo implements Serializable {
    @Id//主键
    @Column//每个属性对应数据库列
    @GeneratedValue(strategy = GenerationType.IDENTITY)//允许主键自增
    private String id;
    @Column
    private String loginName;
    @Column
    private String nickName;
    @Column
    private String passwd;
    @Column
    private String name;
    @Column
    private String phoneNum;
    @Column
    private String email;
    @Column
    private String headImg;
    @Column
    private String userLevel;
}
