package com.demo02;

/**
 * @Title: Manager
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 10:32
 */
public class Manager  extends Emplyee{

    private double money;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void work() {
        System.out.println("工号："+getId()+"经理"+getName()+"在指挥工作.....");
    }

    public void look() {
        System.out.println("工号："+getId()+"经理"+getName()+"的本月蒋健"+getMoney()+"元");
    }
}
