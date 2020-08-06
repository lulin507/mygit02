package com.demo03;

/**
 * @Title: KeyBorder
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 11:16
 */
public class KeyBorder implements Usb{
    @Override
    public void open() {
        System.out.println("打开键盘....");

    }

    @Override
    public void close() {
        System.out.println("关闭键盘....");
    }
}
