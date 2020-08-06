package com.demo05;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/17 0017 10:22
 */
@SuppressWarnings("all")
public class TestDemo {
    public static void main(String[] args) {
        // 1 创建两个个人账户
        PersonAccount p1 = new PersonAccount();
        p1.setName("小明1001");
        p1.setMoney(10000);
        // 2 定期存款
        p1.inMoney(2000,6);
        p1.inMoney(5000);
        // 3 取钱
        p1.outMoney(10000);
        p1.outMoney(100);
        p1.outMoney(100);
        p1.outMoney(300);
        p1.outMoney(500);

        // 2 创建信用账户
        CreditAccount c1 = new CreditAccount();
        c1.setName("小红1001");
        c1.setMoney(10000);
        c1.setLimit(10000);
        // 存款
        c1.inMoney(10000);  // 信用额度不变
        c1.inMoney(200000);  // 信用额度11000
        // 取款
        c1.outMoney(10000);
        c1.outMoney(2000);

         Log log = new Log();
        log.printLog(p1);
        log.printLog(c1);
    }
}
