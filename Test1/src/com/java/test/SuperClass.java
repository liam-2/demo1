package com.java.test;

/**
 * @Author: liam
 * @Date: 2021/1/21 9:00
 */
class SuperClass {
    private int n;
    SuperClass(){
        System.out.println("SuperClass()");
    }
    SuperClass(int n) {
        System.out.println("SuperClass(int n)");
        this.n = n;
    }
}
