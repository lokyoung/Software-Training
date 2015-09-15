package com.lcy.training0915;

/**
 * Created by lokyoung on 15/9/15.
 */
public class User {
    private String name;
    private String password;
    private String passwordConfirm;
    private StringBuffer sb = new StringBuffer();
    private boolean check = false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>=3){
            this.name = name;
            check = true;
        } else{
            check = false;
            sb.append("用户名不能小于3");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>=6){
            this.password = password;
            check = true;
        } else{
            check = false;
            if(sb != null){
                sb.append(",");
            }
            sb.append("密码长度不能小于6");
        }
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        if(passwordConfirm.equals(password)){
            this.passwordConfirm = passwordConfirm;
            check = true;
        } else{
            check = false;
            if(sb != null){
                sb.append(",");
            }
            sb.append("两次输入的密码不一致!");
        }
    }

    public StringBuffer getSb() {
        return sb;
    }

    public void setSb(StringBuffer sb) {
        this.sb = sb;
    }

    public boolean isCheck() {
        return check;
    }

    public void setCheck(boolean check) {
        this.check = check;
    }

    public String result(){
        if(check){
            return "注册成功，请牢记用户名和密码！";
        } else {
            return sb.toString();
        }
    }
}

