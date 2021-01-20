package com.java.test;
import java.util.ArrayList;
/**
 * @Author: liam
 * @Date: 2021/1/20 15:07
 */
public class RunoobTest {
    public static void main(String[] args) {
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        sites.set(1,"shit");
        System.out.println(sites);
    }
}
