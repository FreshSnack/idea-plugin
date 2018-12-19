package com.amar.service;

/**
 * @author dingmx
 * @date 2018/12/19 22:12
 */
public class CounterServiceImpl implements CounterService {

    private int count = 0; // 计数器
    public final int maxCount = 3; // 最大数

    @Override
    public int increaseCounter() {
        ++this.count;
        return this.count > 3 ? -1 : this.count;
    }

    @Override
    public int decreaseCounter() {
        --this.count;
        return this.count > 3 ? -1 : this.count;
    }
}
