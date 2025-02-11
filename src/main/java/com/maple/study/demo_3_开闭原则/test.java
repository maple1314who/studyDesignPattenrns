package com.maple.study.demo_3_开闭原则;

import com.maple.study.demo_3_开闭原则.domain.ApiStatInfo;
import com.maple.study.demo_3_开闭原则.domain.ApplicationContext;

/**
 * @author caihao
 * @create 2025-02-11 21:43
 */
public class test {

    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();

        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }

}
