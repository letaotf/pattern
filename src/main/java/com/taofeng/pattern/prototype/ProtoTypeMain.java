package com.taofeng.pattern.prototype;

/**
 * <p>原型模式</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/12/20 下午5:24
 * @since V1.0
 */
public class ProtoTypeMain {

    public static void main(String[] args) {

        Email email = new Email();
        Email email1 = email.getClone();

        System.out.println(email.getA() == email1.getA());

        System.out.println(email == email1);

        System.out.println(email.getAttachment() == email1.getAttachment());

    }
}
