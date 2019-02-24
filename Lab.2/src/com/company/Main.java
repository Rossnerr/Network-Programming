package com.company;

public class Main {
    public static void main(String args[]){
        MyThread t1 = new MyThread("1");
        MyThread t2 = new MyThread("2");
        MyThread t3 = new MyThread("3");
        MyThread t4 = new MyThread("4");
        MyThread t5 = new MyThread("5");
        MyThread t6 = new MyThread("6");
        MyThread t7 = new MyThread("7");

        t1.setThreadsToBeExecutedBefore(t2);
        t1.setThreadsToBeExecutedBefore(t3);
        t1.setThreadsToBeExecutedBefore(t4);
        t2.setThreadsToBeExecutedBefore(t5);
        t3.setThreadsToBeExecutedBefore(t6);
        t4.setThreadsToBeExecutedBefore(t7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
    }
}