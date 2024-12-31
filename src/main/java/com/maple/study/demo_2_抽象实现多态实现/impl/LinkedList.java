package com.maple.study.demo_2_抽象实现多态实现.impl;

import com.maple.study.demo_2_抽象实现多态实现.Iterator;

/**
 * @author caihao
 * @create 2024-12-31 14:35
 */
public class LinkedList implements Iterator {
    @Override
    public String hasNext() {
        return "linkedList has next";
    }

    @Override
    public String next() {
        return "linkedList next";
    }

    @Override
    public String remove() {
        return "linkedList remove";
    }
}
