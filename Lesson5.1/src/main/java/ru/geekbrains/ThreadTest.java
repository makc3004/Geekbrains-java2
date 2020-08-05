package ru.geekbrains;

public class ThreadTest {

    public static void main(String[] args){
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                Thread.currentThread().sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("A");
        }
    });
    t1.start();
        Thread t2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("B");
            }
        });
        t2.start();
        Thread t3=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("C");
            }
        });
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("D");
    }
}
