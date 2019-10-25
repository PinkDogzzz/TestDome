package com.ydog.test;

import java.util.Optional;

/**
 * @author TheRockDog
 * @DATE 2019/10/25-20:30
 */
public class OptionalDome {

    public static void main(String[] args) throws Exception {

        // 创建一个空的Optional对象；其value属性为Null
        Optional optional = Optional.empty();

        // 根据传入的值构建一个Optional对象
        optional = Optional.of("test");// 传入的值必须非空 否则回报空指针

        // 传入的值可以是空值，如果传入的值是空值，则与empty返回的结果是一样的
        optional = Optional.ofNullable("");

        // Optional方法的使用
        // 判断结果不为空后使用
        Optional<String> s = Optional.ofNullable(OptionalDome.test());
        s.ifPresent(System.out::println);

        // 变量为空时提供默认值
        String s1 ="";
        Optional<String> o = Optional.ofNullable(s1);
        System.out.println(o.orElse("test"));

        // 变量为空时抛出异常，否则使用
        Optional<String> o1 = Optional.ofNullable(s1);
        System.out.println(o1.orElseThrow(()->new Exception("test")));

    }


    public static String test(){
        return "test";
    }
}
