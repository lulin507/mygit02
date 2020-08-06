package com.demo06;

/**
 * @Title: Fun01
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 15:37
 */
public class Fun01 {


    /**
     * 定义简单的加法运算
     */
    public static void add(int a,int b) {
        int c = a + b;
        System.out.println(c);
    }

    /**
     * main 就是一个方法
     *
     * @param args
     */
    public static void main(String[] args) {
         int a = 10;
         int b = 20;
         add(a,b);
    }
}
