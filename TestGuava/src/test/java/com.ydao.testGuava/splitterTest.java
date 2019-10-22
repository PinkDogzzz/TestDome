package com.ydao.testGuava;

import com.google.common.base.Splitter;
import org.junit.Test;

import java.util.List;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-0:40
 */
public class splitterTest {

    @Test
    public void testSplitOnSplit() {
        List<String> result = Splitter.on("-").splitToList("java-php-linux-hadoop");
        //[java, php, linux, hadoop]
        System.out.println(result);
    }

    @Test
    public void testSplitOnSplitOmitEmpty() {
        List<String> result = Splitter.on("-").splitToList("java-php-linu--hadoop");
        //[java, php, linu,  , hadoop]
        System.out.println(result);
        //5
        System.out.println(result.size());

        result = Splitter.on("-").omitEmptyStrings().splitToList("java-php-linu--hadoop");
        //4
        System.out.println(result.size());
    }

    @Test
    public void testSplitOnSplitTrimResult(){
        List<String> result = Splitter.on("-").splitToList("java - php-linu-hadoop");
        //[java ,  php, linu, hadoop]
        System.out.println(result);

        result = Splitter.on("-").trimResults().splitToList("java - php-linu-hadoop");
        //[java, php, linu, hadoop]
        System.out.println(result);
    }

    @Test
    public void testFixLenght(){
        List<String> result = Splitter.fixedLength(3).splitToList("aaabbbccc");
        //[aaa, bbb, ccc]
        System.out.println(result);
    }

    @Test
    public void testSplitOnSplitLimit(){
        List<String> result = Splitter.on("-").limit(3).splitToList("java-php-ios-js");
        //[java, php, ios-js]
        System.out.println(result);
    }

}
