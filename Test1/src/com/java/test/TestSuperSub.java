package com.java.test;

/**
 * @Author: liam
 * @Date: 2021/1/21 9:01
 */
public class TestSuperSub{
    public static void main (String[] args){
        System.out.println("------SubClass 类继承------");
        SubClass sc1 = new SubClass();
        SubClass sc2 = new SubClass(100);
        System.out.println("------SubClass2 类继承------");
        SubClass2 sc3 = new SubClass2();
        SubClass2 sc4 = new SubClass2(200);
    }
}
