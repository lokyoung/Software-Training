package com.lcy.traning0914;

/**
 * Created by lokyoung on 15/9/14.
 */
public class CustomerTest2 {
    public static void main(String[] args){
        Customer customer1 = new Customer("lcy", "21", true);
        Customer customer2 = new Customer("lc", "20", false);
        CustomerBiz cb = new CustomerBiz();
        cb.addCustomer(customer1);
        cb.addCustomer(customer2);
        cb.showCustomers();
    }
}
