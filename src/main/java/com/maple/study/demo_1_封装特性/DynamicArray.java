package com.maple.study.demo_1_封装特性;

public class DynamicArray {

    private static final int DEFAULT_CAPACITY = 10;

    protected int size = 0;

    protected int capacity = DEFAULT_CAPACITY;

    protected Integer[] elements = new Integer[DEFAULT_CAPACITY];

    public int size() {
        return size;
    }

    public Integer get(int index) {
        if (index >= 0 && index < size) {  // 确保访问的索引有效
            return elements[index];
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds: " + index);
        }
    }

    public void add(int element) {
        ensureCapacity();
        elements[size++] = element;  // 确保元素被正确添加
    }

    protected void ensureCapacity() {
        if (size == capacity) {
            capacity *= 2;  // 扩容时将容量加倍
            Integer[] newElements = new Integer[capacity];
            System.arraycopy(elements, 0, newElements, 0, elements.length);
            elements = newElements;
        }
    }
}
