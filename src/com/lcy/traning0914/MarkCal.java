package com.lcy.traning0914;

import java.util.*;

/**
 * Created by lokyoung on 15/9/14.
 */
public class MarkCal {
    private int total;
    private int average;
    public MarkCal(ArrayList<Integer> al){
        total = 0;
        for (int i : al) {
            total = total + i;
        }
        average = total / al.size();
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<Integer>();
        System.out.print("请输入java成绩：");
        al.add(Integer.parseInt(sc.next()));
        System.out.print("请输入c语言成绩：");
        al.add(Integer.parseInt(sc.next()));
        System.out.print("请输入数据库成绩：");
        al.add(Integer.parseInt(sc.next()));

        MarkCal mc = new MarkCal(al);
        System.out.println("总分是：" + mc.getTotal());
        System.out.println("平均分是：" + mc.getAverage());
    }
}
