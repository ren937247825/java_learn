package com.itheima;
import java.util.Scanner;
public class Test01 {
    public static void main(String[] args) {
        // 键盘录入星期数
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个星期数：");
        int week = sc.nextInt();

        if (week < 1 || week > 7){
            System.out.println("你输入的星期数有误");
        } else if (week == 1) {
            System.out.println("跑步");
        } else if (week == 2) {
            System.out.println("游泳");
        } else if (week == 3) {
            System.out.println("慢走");
        } else if (week == 4) {
            System.out.println("动感单车");
        } else if (week == 5) {
            System.out.println("爬山");
        } else if (week == 6) {
            System.out.println("好好吃一顿");
        }
    }
}
