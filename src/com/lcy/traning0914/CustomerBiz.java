package com.lcy.traning0914;

import java.util.ArrayList;

/**
 * Created by lokyoung on 15/9/14.
 */
public class CustomerBiz {
    ArrayList<String> al = new ArrayList<String>();
    ArrayList<Customer> alc = new ArrayList<Customer>();
    public void addName(String name){
        al.add(name);
    }
    public void showName(){
        System.out.println("客户姓名：");
        for (String s : al) {
            System.out.print(s + "\t");
        }
        System.out.println();
    }

    public boolean editName(String oldName, String newName){
        int i = al.indexOf(oldName);
        if(i != -1){
        al.remove(i);
        al.add(i, newName);
        return true;
        } else{
            return false;
        }
    }

    public void addCustomer(Customer customer){
        alc.add(customer);
    }
    public void showCustomers(){
        System.out.println("客户信息");
        for (Customer customer : alc) {
            System.out.print(customer.getName() + "\t"
                           + customer.getAge()  + "\t"
                           + customer.isCreditCard());
            System.out.println();
        }
    }
}
