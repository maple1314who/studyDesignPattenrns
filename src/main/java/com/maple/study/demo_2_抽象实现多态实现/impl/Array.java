package com.maple.study.demo_2_抽象实现多态实现.impl;

import com.maple.study.demo_2_抽象实现多态实现.Iterator;

/**
 * @author caihao
 * @create 2024-12-31 14:34
 */
public class Array implements Iterator {
    @Override
    public String hasNext() {
        return "array hasNext";
    }

    @Override
    public String next() {
        return "array next";
    }

    @Override
    public String remove() {
        return "array remove";
    }
}
