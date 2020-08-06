package com.demo06;

import java.util.Arrays;

/**
 * @Title: Fun03
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2020/6/18 0018 16:30
 */
public class Fun03 {


    public  static  void  fun(int[] arr) {
        arr[2] = 10;
    }

    public static void main(String[] args) {
          int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }
}
