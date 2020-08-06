package com.demo03;

/**
 * @Title: Computer
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 11:09
 * 电脑列
 */
public class Computer {

    public void openComputer() {
        System.out.println("打开电脑.....");
    }

    /**
     * 面向接口编程
     *     接口作为一个多态参数  接收其实现类
     *      方法体中  运行实现类中的具体方法
     * @param usb
     */
    public void use(Usb usb) {
        usb.open(); //打开接口
        usb.close(); //关闭接口
    }


    public void closeComputer() {
        System.out.println("关闭电脑.....");
    }

}
