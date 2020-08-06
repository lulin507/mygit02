package com.demo05;

/**
 * @Title: Log
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 14:59
 *
 * 针对于日志抽取出来的功能
 */
public class Log {

    /**
     * 存日志
     *   分析  存储给哪个账户
     *                个人账户
     *                信用账户
     *                 其他账户
     *         日志
     */
    public void saveLog(Account account,String msg) {
           // 1 获取当前日志的索引
           int index  = account.getIndex();
           if(index == 3) {
               index = 0;
           }
           // 2 获取日志数组
           String[] logs = account.getLogs();
           // 3 判断该账户是否是信用账户 如果是信用账户 那么需要将信用账户的信用值打印出来
           if(account instanceof  CreditAccount) {
               CreditAccount c = (CreditAccount)account;
               msg +="，当前的信用额度是:"+c.getLimit();
           }


           logs[index] = msg;

           // 3 累加日志索引
           index++;
           account.setIndex(index);

    }

    /**
     * 获取打印日志
     */
    public void printLog(Account account) {
        // 1 获取日志
        String[] logs = account.getLogs();
        // 2 遍历日志
        for(String log:logs) {
            if(log != null && !"".equals(log))
                System.out.println(log);
        }

    }
}
