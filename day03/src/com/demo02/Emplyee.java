package com.demo02;

/**
 * @Title: Emplyee
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 10:29
 *
 * 员工类
 */
public abstract  class Emplyee {

    private String id;    // 员工编号

    private String  name; // 员工的姓名

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract  void work();  // 工作方法
}
