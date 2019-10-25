package com.ydog.test;

import java.util.function.Consumer;

/**
 * @author TheRockDog
 * @DATE 2019/10/24-16:45
 */
public class TestDome {

    // 定义一个consumer对象,传统方式
    Consumer consumer = new Consumer() {
        @Override
        public void accept(Object o) {
            System.out.println(o);
        }
    };

    // java8函数式编程接口
    Consumer consumer2 = (o) ->{
        System.out.println(o);
    };

    // 函数体中只有一条语句
    Consumer consumer3 = (o) -> System.out.println(o);

    //针对输入的参数将其调用System.out中的静态方法println进行打印。
    Consumer consumer4 = System.out::print;

}
