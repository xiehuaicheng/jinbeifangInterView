package org.example;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

/**
 * @Author：xieHuaiCheng
 * @Package：org.example
 * @Project：Default (Template) Project
 * @name：${NAME}
 * @Date：2024/2/17 13:45
 * @Filename：${NAME}
 */
public class Main {
    public static void main(String[] args) {
        while (true){
            System.out.println("请输入需要验证的题目数:");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (num ==1){
                Dad dad = new Dad();
                System.out.println("请输入苹果的重量:");
                int applesWeight = scanner.nextInt();
                System.out.println("请输入草莓的重量:");
                int strawberriesWeight = scanner.nextInt();
                System.out.println("水果的总价为:"+dad.calculateTotalPrice(applesWeight,strawberriesWeight));
            }else if (num == 2){
                Dad dad = new Dad();
                System.out.println("请输入苹果的重量:");
                int applesWeight = scanner.nextInt();
                System.out.println("请输入草莓的重量:");
                int strawberriesWeight = scanner.nextInt();
                System.out.println("请输入芒果的重量:");
                int manGoWeight = scanner.nextInt();
                System.out.println("水果的总价为:"+dad.calculateTotalPrice(applesWeight,strawberriesWeight,manGoWeight));
            }else if (num == 3){
                Son1 son1 = new Son1();
                System.out.println("请输入苹果的重量:");
                int applesWeight = scanner.nextInt();
                System.out.println("请输入草莓的重量:");
                int strawberriesWeight = scanner.nextInt();
                System.out.println("请输入芒果的重量:");
                int manGoWeight = scanner.nextInt();
                System.out.println("水果的总价为:"+son1.calculateTotalPrice(applesWeight,strawberriesWeight,manGoWeight));
            }else if (num == 4){
                Son2 son2 = new Son2();
                System.out.println("请输入苹果的重量:");
                int applesWeight = scanner.nextInt();
                System.out.println("请输入草莓的重量:");
                int strawberriesWeight = scanner.nextInt();
                System.out.println("请输入芒果的重量:");
                int manGoWeight = scanner.nextInt();
                System.out.println("水果的总价为:"+son2.calculateTotalPrice(applesWeight,strawberriesWeight,manGoWeight));
            }
            System.out.println("退出验证题目数请输入99:");
            int flag = scanner.nextInt();
            if (flag==99) {
                break;
            }

        }

    }
}