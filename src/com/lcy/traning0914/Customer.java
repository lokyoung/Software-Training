package com.lcy.traning0914;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by lokyoung on 15/9/14.
 */
public class Customer {
    private String name;
    private String age;
    private boolean creditCard;

    public Customer(String name, String age, boolean creditCard){
        this.name = name;
        this.age = age;
        this.creditCard = creditCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isCreditCard() {
        return creditCard;
    }

    public void setCreditCard(boolean creditCard) {
        this.creditCard = creditCard;
    }
}
