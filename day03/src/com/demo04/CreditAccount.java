package com.demo04;

/**
 * @Title: CreditAccount
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/17 0017 10:05
 * 信用账户
 */
@SuppressWarnings("all")
public class CreditAccount extends Account {



    private double limit; // 信用额度




    public double getLimit() {
        return limit;
    }



    // ------------功能------------


    /**
     * 设置信用额度
     * @param limit
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    /**
     * 活期存款
     * @param money
     */
    public  void  inMoney(double money) {
        /**
         *    当每单存款大于10万元 信用额度增加10%
         *       您已存款XXX钱 当前的信用额度为XXX
         */
        if(money >= 100000) {
            double newLimit = this.getLimit()*1.1;
            this.setLimit(newLimit);
        }
         super.setNewMoney(money);
        System.out.println("活期存款：信用账户:"+super.getName()+",余额："+super.getMoney()+",信用额度:"+this.getLimit());

    }


    /**
     * 取款
     * @param money
     */
    public void outMoney(double money) {
        /**
         *      当信用卡取款的金额小于信用额度的20% 需要交纳取款金额 1%的利息
         *       打印 您成功取款xxx元  交纳利息xxx元
         */
        String msg = "";
        // 定义利息
        double lix = 0.0;
        double newLimit = this.getLimit()*0.2;
        if(money < newLimit) {
            lix = money * 0.01;
        }
        // 获取剩余金额
        double tempMoney = super.getMoney() - money -lix;
        // 刷新账户余额
        super.setMoney(tempMoney);
        msg = "信用账户:"+super.getName()+"取款："+money+",交纳利息:"+lix+",当前余额："+super.getMoney();
        // 打印
        System.out.println(msg);

        // 取款   -   保存日志
        // 取款   -   保存日志
        // 1 获取当前保存日志的索引位置
//        int index = super.getIndex();  // 3
//        if(index == 3) {
//            index = 0;
//        }
//        this.getLogs()[index] = "日志:"+msg+",信用额度:"+this.getLimit();
//        index++;
//        super.setIndex(index);

        super.saveLog(msg);
    }

}
