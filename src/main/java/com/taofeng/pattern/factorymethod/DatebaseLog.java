package com.taofeng.pattern.factorymethod;

/**
 * <p>描述</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/12/18 下午3:43
 * @since V1.0
 */
public class DatebaseLog extends Log{

    @Override
    public void writeLog() {
        System.out.println("数据库日志输出");
    }
}
