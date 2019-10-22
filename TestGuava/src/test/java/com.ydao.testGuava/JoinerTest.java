package com.ydao.testGuava;

import com.google.common.base.Joiner;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheRockDog
 * @DATE 2019/10/20-0:34
 */
public class JoinerTest {

    private final List<String> stringList = Arrays.asList(
      "dog","cat","pig","java"
    );

    private final List<String> stringListWithNullValue = Arrays.asList(
            "dog","cat","pig",null
    );

    @Test
    public void testJoinOnJoin(){
        String result = Joiner.on("#").join(stringList);
        //dog#cat#pig#java
        System.out.println(result);
    }

    @Test
    public void testJoinOnJoinWithNullValue(){
        String result = Joiner.on("#").join(stringListWithNullValue);
        //NullPointerException
        System.out.println(result);
    }

    @Test
    public void testJoinOnJoinWithNullValueButSkip(){
        String result = Joiner.on("#").skipNulls().join(stringListWithNullValue);
        //dog#cat#pig
        System.out.println(result);
    }

    @Test
    public void testJoinOnJoinWithNullValueUseDefault(){
        String result = Joiner.on("#").useForNull("shit").join(stringListWithNullValue);
        //dog#cat#pig#shit
        System.out.println(result);
    }

    @Test
    public void testJoinOnAppend(){
        final StringBuilder builder = new StringBuilder();
        StringBuilder reslut = Joiner.on("#").useForNull("shit").appendTo(builder, stringListWithNullValue);
        //dog#cat#pig#shit
        System.out.println(reslut);
    }



}
