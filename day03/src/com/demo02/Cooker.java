package com.demo02;

/**
 * @Title: Cooker
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 10:32
 * 初始类
 */
public class Cooker extends Emplyee implements  Vip {

    public void work() {
        System.out.println("工号："+getId()+"厨师"+getName()+"在炒菜.....");
    }

    public void vipServer() {
        System.out.println("工号："+getId()+"厨师"+getName()+"提供vip服务.....");
    }
}
