package com.lcy.traning0914;

import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/14.
 */
public class CustomerTest {
    public static void main(String[] args){
        System.out.print("请输入客户的名字:");
        Scanner sc = new Scanner(System.in);
        CustomerBiz cb = new CustomerBiz();
        cb.addName(sc.next());
        System.out.print("是否继续输入:(y/n)");
        while(sc.next().equals("y")){
            System.out.print("请输入客户的名字:");
            cb.addName(sc.next());
            System.out.print("是否继续输入:(y/n)");
        }
        cb.showName();
        System.out.print("请输入要修改的客户名：");
        String oldName = sc.next();
        System.out.print("请输入新的客户名：");
        String newName = sc.next();
        if(cb.editName(oldName, newName)){
            System.out.println("找到并修改成功");
            cb.showName();
        } else{
            System.out.println("用户名不存在");
        }

    }
}
