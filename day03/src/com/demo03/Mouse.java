package com.demo03;

/**
 * @Title: Mouse
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 11:14
 */
public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标....");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标....");
    }
}
