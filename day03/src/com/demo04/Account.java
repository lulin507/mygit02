package com.demo04;

/**
 * @Title: Account
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/17 0017 11:12
 */
public  abstract  class Account {

    // 设置成员变量
    private String name;  // 账户名

    private String pwd;   // 密码

    private double money;  // 余额

    private String[] logs = new String[3];  // 最多存储3个日志
    private int index = 0;  // 当前日志存储的索引

    // 生成get/set

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }



    public void setMoney(double money) {
        this.money = money;
    }

    public String[] getLogs() {
        return logs;
    }

    public void setLogs(String[] logs) {
        this.logs = logs;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    // ------------功能------------

    /**
     * 查看卡号
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 查看余额
     * @return
     */
    public double getMoney() {
        return money;
    }


    // 抽象方法

    /**
     * 存钱
     * @param money
     */
    public abstract  void inMoney(double money);

    /**
     * 取钱
     * @param money
     */
    public abstract  void outMoney(double money);

    /**
     * 保存日志
     * @param msg
     *
     *   如果是信用账户  需要将 当前的信用额度保存起来
     */
    public void saveLog(String msg) {
        // 日志添加
        // 1 获取索引值
        int i = this.getIndex();
        if(i == 3) {
            i = 0;
        }

        // 判断信用账户还是个人账户 ，如果是信用账户  应该为其添加信用额度
        // System.out.println(this);
        if(this instanceof CreditAccount) {
            msg += ",当前的信用额度是："+((CreditAccount) this).getLimit();
        }

        // 2 存储日志
        this.getLogs()[i] = msg;
        // 3 重置索引
        i++;
        this.setIndex(i);

    }

    /**
     * 打印日志的方法
     */
    public void printLogs() {
         // 1 获取日志
         String[] logs = this.getLogs();
         for (String log:logs) {
             if(log != null  && !"".equals(log)) {
                 System.out.println(log);
             }
         }
    }


    /**
     * 重新设置
     * @param money
     */
    protected void setNewMoney(double money) {
        // 1 获取原有的金额
        double oldMoney = this.getMoney();
        //  2 获取新的金额
        double newMoney = money + oldMoney;
        //  3 刷新当前余额
        this.setMoney(newMoney);
    }




}
