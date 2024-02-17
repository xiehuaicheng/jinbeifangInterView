package org.example;

import java.math.BigDecimal;

/**
 * @Author：xieHuaiCheng
 * @Package：org.example
 * @Project：InterViewTitle
 * @name：Title
 * @Date：2024/2/17 13:59
 * @Filename：Title
 */
public class Dad {
    /**
     * 题目一
     * 计算水果的总价
     *
     * @param applesWeight       苹果的重量
     * @param strawberriesWeight 草莓的重量
     * @return 水果的总价
     */
    public  BigDecimal calculateTotalPrice(int applesWeight, int strawberriesWeight) {
        if (applesWeight < 0 || strawberriesWeight <0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数");
        }
        // 定义苹果和草莓的单价
        BigDecimal applePrice = new BigDecimal("8");
        BigDecimal strawberryPrice = new BigDecimal("13");
        // 计算总价
        BigDecimal totalPrice = applePrice.multiply(BigDecimal.valueOf(applesWeight)).add(strawberryPrice.multiply(BigDecimal.valueOf(strawberriesWeight)));
        return totalPrice;
    }

    /**
     * 题目二
     * 重构方法
     * 计算水果的总价
     *
     * @param applesWeight       苹果的重量
     * @param strawberriesWeight 草莓的重量
     * @param manGoWeight        芒果的重量
     * @return 水果的总价
     */
    public  BigDecimal calculateTotalPrice(int applesWeight, int strawberriesWeight,int manGoWeight) {
        if (applesWeight < 0 || strawberriesWeight < 0 || manGoWeight < 0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数");
        }
        // 定义苹果和草莓的单价
        BigDecimal applePrice = new BigDecimal("8");
        BigDecimal strawberryPrice = new BigDecimal("13");
        BigDecimal manGoPrice = new BigDecimal("20");
        // 计算总价
        BigDecimal totalPrice = applePrice.multiply(BigDecimal.valueOf(applesWeight))
                .add(strawberryPrice.multiply(BigDecimal.valueOf(strawberriesWeight)))
                .add(manGoPrice.multiply(BigDecimal.valueOf(manGoWeight)));
        return totalPrice;
    }
}
