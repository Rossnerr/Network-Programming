package com.company;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
    private List<MyThread> threadsToBeExecutedBefore = new ArrayList<>();
    private boolean executed = false;
    private String name;

    public MyThread(String name){
        this.name = name;
    }

    public void setThreadsToBeExecutedBefore(MyThread t){
        this.threadsToBeExecutedBefore.add(t);
    }

    public void run(){
        if(threadsToBeExecutedBefore != null){
            for(MyThread myThread: threadsToBeExecutedBefore){
                if(myThread.executed  == false){
                    synchronized (myThread){
                        try {
                            myThread.wait();
                        } catch (InterruptedException e){
                            System.out.println("I wasn't done!");
                        }
                    }
                }
            }
        }

        System.out.println(name);
        this.executed = true;
        synchronized (this){
            this.notifyAll();
        }
    }
}