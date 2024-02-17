package org.example;

import java.math.BigDecimal;

/**
 * @Author：xieHuaiCheng
 * @Package：org.example
 * @Project：InterViewTitle
 * @name：Son2
 * @Date：2024/2/17 14:33
 * @Filename：Son2
 */
public class Son2 extends Dad{

    /**
     * 题目四
     * 重写方法
     * 满减后的总价
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
        // 计算总价
        BigDecimal totalPrice = applePrice.multiply(BigDecimal.valueOf(applesWeight))
                .add(strawberryPrice.multiply(BigDecimal.valueOf(strawberriesWeight)))
                .add(manGoPrice.multiply(BigDecimal.valueOf(manGoWeight)));
        // 计算满减金额
        BigDecimal discount = totalPrice.divide(new BigDecimal("100"), 0, BigDecimal.ROUND_DOWN)
                .multiply(new BigDecimal("10"));

        // 应付金额
        BigDecimal finalPrice = totalPrice.subtract(discount);
        return totalPrice;
    }
}
