package com.ydog.test;

import java.util.function.Consumer;

/**
 * @author TheRockDog
 * @DATE 2019/10/24-16:53
 */
public class ConsumerDome {


    public static void main(String[] args) {
        Consumer consumer1 = System.out::println;
        Consumer consumer2 = n -> System.out.println(n+"consumer2");

        // 执行完1后再执行2的accept方法
        consumer1.andThen(consumer2).accept("test");

        // 连续执行1的accept方法
        consumer1.andThen(consumer1).andThen(consumer1).accept("test02");

    }
}
