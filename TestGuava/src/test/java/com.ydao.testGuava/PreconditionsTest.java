package com.ydao.testGuava;

import com.google.common.base.Preconditions;
import org.junit.Test;

import java.util.List;

/**
 * @author TheRockDog
 * @DATE 2019/10/21-0:59
 */
public class PreconditionsTest {

    @Test(expected=NullPointerException.class)
    public void testCheckNotNull(){
        checkNotNull(null);
    }

    private void checkNotNull(final List<String> list){
        Preconditions.checkNotNull(list);
    }

    @Test
    public void testCheckNotNullWithMsg(){
        try {
            checkNotNullWithMsg(null);
        }catch (Exception e){
            //NullPointerException
            System.out.println(e);
            //list is null
            System.out.println(e.getMessage());
        }
    }

    private void checkNotNullWithMsg(final List<String> list){
        Preconditions.checkNotNull(list,"list is null");
    }
}
