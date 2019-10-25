package com.ydog.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * @author TheRockDog
 * @DATE 2019/10/24-18:10
 * Stream可以对多个元素进行一系列的操作，也可以支持对某些操作进行并发处理
 */
public class StreamDome {

    //Stream创建对象的几种方式

    // 创建一个空的Stream对象
    Stream stream = Stream.empty();

    // 通过集合类中的stream或者parallelStream方法创建
    List<String> list = Arrays.asList("a","b","c","d");
    // 获取串行的stream对象
    Stream listStream = list.stream();
    // 获取并行的stream对象
    Stream parallelListStream = list.parallelStream();

    //通过stream中的of方法创建
    Stream s = Stream.of("a");
    Stream s2 = Stream.of("a","b","c","d");

    public static void main(String[] args) {
        // 通过Stream中的iterate方法创建,iterate方法有两个不同参数的方法：
        // public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f);
        // public static<T> Stream<T> iterate(T seed, Predicate<? super T> hasNext, UnaryOperator<T> next);

        // 通过Stream中的generate方法创建对象
        // 与iterate中创建无限元素的Stream类似，不过它的每个元素与前一元素无关，且生成的是一个无序的队列。
        // 也就是说每一个元素都可以随机生成。因此一般用来创建常量的Stream以及随机的Stream等。
        // 随机生成10个Double元素的Stream并将其打印
        Stream.generate(new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        }).limit(10).forEach(System.out::println);

        //以上代码可以简化为
        Stream.generate(() -> Math.random()).limit(10).forEach(System.out::println);
    }
























}
