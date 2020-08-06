package com.demo06;

/**
 * @Title: Fun02
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 15:54
 */
public class Fun02 {

    public static  void fun(Person p) {
        p.name = "小明";
    }



    public  static  void fun(int a,int b) {
         a = 30;
         b = 10;
    }


    public static void main(String[] args) {
          int a = 10;
          int b = 20;
           fun(a,b);
        System.out.println(a);
        System.out.println(b);
//        Person p = new Person();
//        p.name = "小红";
//        fun(p);
//        System.out.println(p.name);
    }
}

class Person {
    public String name;
}