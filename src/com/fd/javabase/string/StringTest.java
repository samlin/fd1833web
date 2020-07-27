package com.fd.javabase.string;

import org.junit.Test;

public class StringTest {
    @Test
    public void testEquals() throws Exception{
        String tmp = "abc";
        String strTemp = "abc";
        System.out.println("tmp==strTemp = " +( tmp == strTemp));


        final String tmp3 = "abc";
        System.out.println("tmp==tmp3 = " + (tmp == tmp3));

         final String tmp4 = "ab";
          String tmp5 = "c";

         String tmp6=tmp4+tmp5;

        System.out.println("tmp==tmp6 = " +( tmp == tmp6));


    }
}
