package com.maple.study.demo_1_封装特性;

/**
 * @author caihao
 * @create 2024-12-31 14:04
 */
public class Example {

    public static void test(DynamicArray dynamicArray){
        dynamicArray.add(5);
        dynamicArray.add(1);
        dynamicArray.add(3);
        for (int i = 0; i < dynamicArray.size(); ++i) {
            System.out.println(dynamicArray.get(i));
        }
    }

    public static void main(String[] args) {
        DynamicArray dynamicArray = new SortedDynamicArray();
        test(dynamicArray);
    }


}
