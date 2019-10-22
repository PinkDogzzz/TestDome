package com.ydao.testGuava;

import com.google.common.base.Strings;
import org.junit.Test;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-1:12
 */
public class StringsTest {

    @Test
    public void testStringMethed(){
        String result = Strings.emptyToNull("");
        //null
        System.out.println(result);

        result=Strings.nullToEmpty(null);
        //true
        System.out.println(result.equals(""));

        result=Strings.nullToEmpty("dog");
        //false
        System.out.println(result.equals(""));

        result=Strings.commonPrefix("haha","hi");
        //h
        System.out.println(result);

        result=Strings.commonPrefix("haha","ahah");
        //""
        System.out.println(result);

        result=Strings.repeat("dog",3);
        //dogdogdog
        System.out.println(result);
    }
}
