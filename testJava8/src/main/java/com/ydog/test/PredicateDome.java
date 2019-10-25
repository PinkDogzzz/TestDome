package com.ydog.test;

/**
 * @author TheRockDog
 * @DATE 2019/10/24-17:38
 */

import java.util.function.Predicate;

/**
 * Predicate为函数式接口，predicate的中文意思是“断定”，即判断的意思，判断某个东西是否满足某种条件；
 * 因此它包含test方法，根据输入值来做逻辑判断，其结果为True或者False。
 */
public class PredicateDome {

    public static void main(String[] args) {
        Predicate<String> p = o -> o.equals("test");
        Predicate<String> g = o -> o.startsWith("t");

        // negate: 用于对原来的Predicate做取反处理；
        System.out.println(p.negate().test("test"));

        // and: 针对同一输入值，多个Predicate均返回True时返回True，否则返回False；
        System.out.println(p.and(g).test("test"));

        // or: 针对同一输入值，多个Predicate只要有一个返回True则返回True，否则返回False
        System.out.println(p.or(g).test("ttt"));


    }


}
