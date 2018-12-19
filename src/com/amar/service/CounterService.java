package com.amar.service;

/**
 * 计数服务
 */
public interface CounterService {
    /**
     * 增加
     * @return
     */
    int increaseCounter();

    /**
     * 减少
     * @return
     */
    int decreaseCounter();
}
