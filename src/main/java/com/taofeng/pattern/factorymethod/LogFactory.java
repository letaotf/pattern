package com.taofeng.pattern.factorymethod;

/**
 * <p>描述</p >
 *
 * @author: 乐陶（letao@maihaoche.com）
 * @date: 2019/12/18 下午3:42
 * @since V1.0
 */
public interface LogFactory {

    Log createLog(String name);
}
