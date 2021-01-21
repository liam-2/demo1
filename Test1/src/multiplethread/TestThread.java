package multiplethread;

/**
 * @Author: liam
 * @Date: 2021/1/21 11:00
 */


import charactor.Hero;

public class TestThread {

    public static void main(String[] args) {


        Runnable runnable = new Runnable() {
            public void run() {
                int seconds =0;


                while (true) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.printf("已经玩了LOL %d 秒%n", seconds++);
                }
            }
        };


        new Thread(runnable).start();

    }


}
