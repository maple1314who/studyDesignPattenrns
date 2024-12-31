package com.maple.study.demo_1_封装特性;

/**
 * @author caihao
 * @create 2024-12-31 14:01
 */
public class DynamicArray {

    private static final int DEFAULT_CAPACITY = 10;

    protected int size = 0;

    protected int capacity = DEFAULT_CAPACITY;

    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() {
        return size;
    }

    public Integer get(int index) {
        return elements[index];
    }

    public void add(int element) {
        ensureCapacity();
        elements[size++] = element;
    }
    protected void ensureCapacity() {
        if (size == capacity) {
            Integer[] newElements = new Integer[capacity << 1];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }
}
