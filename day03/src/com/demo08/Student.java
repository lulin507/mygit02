package com.demo08;

/**
 * @Title: Student
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 17:07
 */
public class Student extends  Person {
    /**
     * 每个构造方法的最前面 都有一个默认的关键字 super
     *   super 的用法和this 差不多
     *   super 调用父类的构造方法
     *   调用构造函数 this 和super不能共存
     *   super 也要写在第一行
     */
    public Student() {
       // System.out.println(1);
     super();
   //  this("");
          // super 作用调用父类的无参构造方法
        // 是俩话学生的之前就已经调用了  父类的构造...
        System.out.println("学生被创建了....");
    }

    public Student(String name) {
            this(name,1);
    }

    public Student(String name,int age) {
          this();
    }
}
