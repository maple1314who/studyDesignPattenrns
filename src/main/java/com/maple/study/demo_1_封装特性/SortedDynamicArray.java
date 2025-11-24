package com.maple.study.demo_1_封装特性;

/**
 * @author caihao
 * @create 2024-12-31 14:05
 */
public class SortedDynamicArray extends DynamicArray{

    @Override
    public void add(int element) {
        ensureCapacity();
        for (int i = size - 1; i >= 0; --i) {
            if (elements[i] > element) {
                elements[i + 1] = elements[i];
            } else {
                break;
            }
        }
        elements[size + 1] = element;
        ++size;
    }
}
