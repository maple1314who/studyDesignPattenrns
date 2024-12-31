package com.maple.study.demo_2_抽象实现多态实现;

import com.maple.study.demo_2_抽象实现多态实现.impl.Array;
import com.maple.study.demo_2_抽象实现多态实现.impl.LinkedList;

/**
 * @author caihao
 * @create 2024-12-31 14:37
 */
public class Main {

    private static void print(Iterator iterator){
        while (iterator.hasNext() != null){
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        Iterator arrayIterator = new Array();
        print(arrayIterator);

        Iterator linkIterator = new LinkedList();
        print(linkIterator);
    }

}
