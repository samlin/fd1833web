package com.fd.javabase;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class CollectionTest {
    @Test
    public void test() throws Exception {
        Set set = new HashSet();
        set.add("ab1");
        set.add("ab2");
        set.add("ab3");
        set.add("ab4");
        set.add("ab5");
        for (Object o : set) {
            System.out.println("o = " + o);
        }

    }
}
