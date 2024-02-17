package org.example;

import java.math.BigDecimal;

/**
 * @Author：xieHuaiCheng
 * @Package：org.example
 * @Project：InterViewTitle
 * @name：Title2
 * @Date：2024/2/17 14:04
 * @Filename：Title2
 */
public class Son1 extends Dad {
    /**
     * 题目三
     * 重写方法
     * 计算水果的总价
     *
     * @param applesWeight       苹果的重量
     * @param strawberriesWeight 草莓的重量
     * @param manGoWeight        芒果的重量
     * @return 水果的总价
     */
    public BigDecimal calculateTotalPrice(int applesWeight, int strawberriesWeight, int manGoWeight) {
        if (applesWeight < 0 || strawberriesWeight < 0 || manGoWeight < 0) {
            throw new IllegalArgumentException("水果斤数为大于等于 0 的整数");
        }
        // 定义苹果和草莓的单价
        BigDecimal applePrice = new BigDecimal("8");
        BigDecimal strawberryPrice = new BigDecimal("13");
        BigDecimal manGoPrice = new BigDecimal("20");
        //草莓折扣
        BigDecimal strawberryDiscountRate = new BigDecimal("0.8");
        // 计算总价
        BigDecimal totalPrice = applePrice.multiply(BigDecimal.valueOf(applesWeight))
                .add(strawberryPrice.multiply(BigDecimal.valueOf(strawberriesWeight)).multiply(strawberryDiscountRate))
                .add(manGoPrice.multiply(BigDecimal.valueOf(manGoWeight)));
        return totalPrice;
    }
}
