package com.demo07;

/**
 * @Title: Person
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 16:49
 */
public class Person {

    public String name;

    private int age;



    /**
     * 定义person的构造方法
     *
     */
    public Person() {
       // String a = "";
        this("小明");
    }

    public Person(String name) {
        this.name = name;
    }
}
