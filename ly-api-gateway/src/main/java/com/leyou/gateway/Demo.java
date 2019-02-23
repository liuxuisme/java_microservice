package com.leyou.gateway;

import java.util.Arrays;
import java.util.Comparator;

public class Demo {
    public static void main(String[] args) {
        // 定义字符串数组
        String[] strArr = {"abc", "cd", "abce", "a"};

        // 传统方法
        // 匿名内部类
        Arrays.sort(strArr, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s2.length(), s1.length());
            }
        });

        // 输出排序结果
        for (String s : strArr) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        // Lambda表达式
        Arrays.sort(strArr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));

        // 输出
        for (String s : strArr) {
            System.out.println(s);
        }
    }

}
