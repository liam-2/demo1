package com.java.test;
import java.util.ArrayList;
import java.util.Iterator;
/**
 * @Author: liam
 * @Date: 2021/1/20 15:07
 */
public class RunoobTest {
    public static void main(String[] args) {

        // 创建集合
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");

        // 获取迭代器

        Iterator<String> it = sites.iterator();
        while(it.hasNext()){
            // 输出集合中的第一个元素
            System.out.println(it.next());

        }



    }
}