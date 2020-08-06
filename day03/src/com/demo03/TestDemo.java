package com.demo03;

/**
 * @Title: TestDemo
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 11:13
 */
public class TestDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.openComputer();
        Usb usb = new Mouse();
        computer.use(usb);
        usb = new KeyBorder();
        computer.use(usb);
        computer.closeComputer();
    }
}
