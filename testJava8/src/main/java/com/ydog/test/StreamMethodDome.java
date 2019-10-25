package com.ydog.test;

import java.util.stream.Stream;

/**
 * @author TheRockDog
 * @DATE 2019/10/25-19:16
 */
public class StreamMethodDome {

    public static void main(String[] args) {
        Stream<String> s = Stream.of("a1","b1","c2","d3");
        // 查找所有包含1的元素并打印
        s.filter(n -> n.contains("1")).forEach(System.out::println);

        // Stream对象中的每个元素添加相同的后缀.txt
        Stream<String> s2 = Stream.of("a1","b1","c2","d3");
        s2.map(n -> n.concat(".txt")).forEach(System.out::println);

        // 将每一个元素的拆分成单个字母，并打印
        Stream<String> s3 = Stream.of("a1","b1","c2","d3");
        s3.flatMap(n -> Stream.of(n.split(""))).forEach(System.out::println);

        // takeWhile:与Filter有点类似，不同的地方就在当Stream是有序时，返回的只是最长命中序列。
        Stream<String> s4 = Stream.of("test", "t1", "t2", "teeeee", "aaaa", "taaa");
        // 以下结果将打印： "test", "t1", "t2", "teeeee"，最后的那个taaa不会进行打印
        // s4.takeWhile(n -> n.contains("t")).forEach(System.out::println);




    }
}
