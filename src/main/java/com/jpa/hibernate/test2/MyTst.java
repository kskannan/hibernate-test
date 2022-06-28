package com.jpa.hibernate.test2;

import com.jpa.hibernate.test.AbstractTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class MyTst {
    public static void main(String[] args) {
        AbstractTest abs = new AbstractTest() {
            @Override
            public void divide() {

            }
            @Override
            public void sum(){
                total = 200;
                System.out.println("sum");
            }

            @Override
            protected void test() {
                System.out.println("test");
            }
        };
        abs.sum();
        abs.print();

        List<String> strLst = new ArrayList<>();

        var lst = List.of("Kannan", "Kumar");
        var mp = Map.of(1, "Kannan", 2, "John", 3, "Chris");
        


      // lst.add("Kannan");
        System.out.println(lst);
    }
}
