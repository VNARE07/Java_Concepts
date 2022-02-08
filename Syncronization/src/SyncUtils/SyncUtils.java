package SyncUtils;

import SyncronizedTreading.Emp;

public class SyncUtils{
    Emp ref;
    public synchronized void read(){
        System.out.println("read started " + Thread.currentThread().getName());
        System.out.println("readingf data " + ref);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("read ended " + Thread.currentThread().getName());
    }
    public synchronized void write(Emp e){
        System.out.println("read started " + Thread.currentThread().getName());
        this.ref = e;
        System.out.println("data wrote " + ref);
        try {
            Thread.sleep(30);
        } catch (InterruptedException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        System.out.println("read ended " + Thread.currentThread().getName());
    }
}
