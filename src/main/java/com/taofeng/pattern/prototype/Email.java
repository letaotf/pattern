package com.taofeng.pattern.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * <p>描述</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/12/20 下午5:25
 * @since V1.0
 */
@Data
public class Email implements Cloneable,Serializable{

    private Attachment attachment = null;

    private Integer a = 1;

    public Email(){
        attachment = new Attachment();
    }

    Email getClone(){
        try {
            return (Email)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Attachment getAttachment() {
        return attachment;
    }
}
