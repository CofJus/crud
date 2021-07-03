/**
 * @author CJH
 * User实体类
 */
package com.hhu.domain;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;//用户名
    private String password;//密码
    private String role;//角色
    private boolean state;//状态
}
