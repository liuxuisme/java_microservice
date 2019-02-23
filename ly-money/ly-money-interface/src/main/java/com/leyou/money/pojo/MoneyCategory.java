package com.leyou.money.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Table(name = "money_category")
@Data
public class MoneyCategory {
    @Id
    @KeySql(useGeneratedKeys = true)
    private int id;

    private int type_id;
    private int parent_id;
    private String name;
    private String description;
    private int sort;

    private int is_deleted = 0;
    private int created_at;
    private int created_by;
    private int updated_at;
    private int updated_by;

//    @Length(max = 30, min = 4, message = "用户名长度只能在4-30之间")
//    private String username;// 用户名
//
//    @JsonIgnore
//    @Length(max = 30, min = 4, message = "密码长度只能在4-30之间")
//    private String password;// 密码
//
//    @Pattern(regexp = "^1[35678]\\d{9}$",message = "手机号格式不正确")
//    private String phone;// 电话
//
//    private Date created;// 创建时间
//
//    @JsonIgnore
//    private String salt;// 密码的盐值

}