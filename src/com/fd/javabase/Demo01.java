package com.fd.javabase;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
        public static void main(String[] args) {
            List list = new ArrayList();
            String[] age =null;
            for (int i=1;i<100000000;i++){
                 age = new String[1024 * 1024 * 1024 * 1024*1024*1024*1024*1024*1024*1024];
                list.add(age);
            }
            System.out.println("list = " + list);
        }

    }