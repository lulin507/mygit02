package com.demo02;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 10:37
 */
public class TestDemo {

    public static void main(String[] args) {
        // 1 创建经理
        Manager m = new Manager();
        m.setMoney(2000);
        m.setId("m1001");
        m.setName("小明");

        m.look();
        m.work();

        // 2 创建服务员
        Server s1 = new Server();
        Server s2 = new Server();

        s1.setId("s1001");
        s1.setName("小红");

        s2.setId("s1002");
        s2.setName("韩梅");

        s1.work();
        s1.vipServer();

        s2.work();
        s2.vipServer();

        // 3 创建厨师
        Cooker c = new Cooker();

        c.setId("c1001");
        c.setName("吉姆");

        c.work();
        c.vipServer();

    }
}
