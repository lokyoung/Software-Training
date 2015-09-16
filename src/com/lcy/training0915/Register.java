package com.lcy.training0915;

/**
 * Created by lokyoung on 15/9/15.
 */
public class Register {
    public boolean verify(String name, String pwd1, String pwd2){
        if(name.length() < 3){
            System.out.println("用户名长度小于3");
            return false;
        } else if(pwd1.length() < 6){
            System.out.println("密码长度小于6");
            return false;
        } else if(pwd1 != pwd2){
            System.out.println("两次密码输入不一致");
            return false;
        }
        return true;
    }
}
