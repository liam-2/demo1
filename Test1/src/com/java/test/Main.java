package com.java.test;

import static com.java.test.Comparators.getComparator;
import static java.util.Arrays.sort;

/**
 * @Author: liam
 * @Date: 2021/1/20 13:59
 */
public class Main {
    public Main() {
    }
    public static void main(String[] args) {
        Person[] person = new Person[] {
                new Person("ouyang", "feng", Boolean.TRUE, 27),
                new Person("zhuang", "gw", Boolean.TRUE,27),
                new Person("zhuang", "gw", Boolean.FALSE, 27),
                new Person("zhuang", "gw", Boolean.FALSE, 2)


        };
        for (Person value : person) {
            System.out.println("before sort=" + value);
        }
        sort(person, getComparator());

        for (Person value : person) {
            System.out.println("after sort=" + value);
        }


    }

}
