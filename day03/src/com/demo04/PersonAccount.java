package com.demo04;

/**
 * @Title: PersonAccount
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/17 0017 10:04
 *
 * 个人账户
 */
@SuppressWarnings("all")
public class PersonAccount extends Account {

    /**
     * 存款方式-定期
     */
    public void inMoney(double money,int month) {
        this.setNewMoney(money);

        //  4 打印
        System.out.println("定期存款：个人账户:"+super.getName()+",存期:"+month+"月,余额："+super.getMoney());
    }

    public void inMoney(double money) {
        this.setNewMoney(money);
        //  4 打印
        System.out.println("活期存款：个人账户:"+super.getName()+",余额："+super.getMoney());

    }




    /**
     * 取款操作
     * @param money
     */
    public  void outMoney(double money) {
       // 1 获取原有的金额
        double oldMoney = this.getMoney();
        String msg = "";

        // 2 判断是否可以取钱
        if(money > oldMoney) {
            msg =  "个人账户:"+super.getName()+"余额不足，当前余额："+super.getMoney();
            System.out.println(msg);
        }else {
            // 3 正常取款
            double newMoney = oldMoney - money;
            //  3 刷新当前余额
            super.setMoney(newMoney);
            msg =  "个人账户:"+super.getName()+"取款："+money+"，当前余额："+super.getMoney();
            System.out.println(msg);
        }


        // 取款   -   保存日志
        super.saveLog(msg);
        // 1 获取当前保存日志的索引位置
//        int index = super.getIndex();  // 3
//        if(index == 3) {
//            index = 0;
//        }
//        this.getLogs()[index] = "日志:"+msg;
//        index++;
//        super.setIndex(index);

    }


}
