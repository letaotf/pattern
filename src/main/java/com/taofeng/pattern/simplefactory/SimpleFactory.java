package com.taofeng.pattern.simplefactory;

/**
 * <p>简单工厂设计模式</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/12/18 下午2:15
 * @since V1.0
 */
public class SimpleFactory {

    public static Fruit getFruit(String name) {
        if("apple".equals(name)){
            return new AppleFruit();
        }
        return null;
    }

    public static void main(String[] args) {
        Fruit apple = getFruit("apple");
        apple.eat();

    }
}
