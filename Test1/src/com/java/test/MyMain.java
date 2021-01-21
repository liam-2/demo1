package com.java.test;

/**
 * @Author: liam
 * @Date: 2021/1/21 10:30
 */
public class MyMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println("stack overflow");


        while(true){


            Thread th = new Thread(new Runnable(){

                @Override
                public void run() {
                    while(true){
                        System.out.println("do not stop");
                    }
                }

            });
            th.start();

        }

    }

}
