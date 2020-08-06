package com.demo02;

/**
 * @Title: Server
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 10:30
 */
public class Server extends Emplyee  implements  Vip {

    public void work() {
        System.out.println("工号："+getId()+"服务员"+getName()+"在上菜.....");
    }

    public void vipServer() {
        System.out.println("工号："+getId()+"服务员"+getName()+"提供vip服务.....");
    }

}
