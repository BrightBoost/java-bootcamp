package com.pluralsight.week3.unfinishedweek2stuff;

public class ForLoop {

    public static void main(String[] args) throws InterruptedException {
        for(byte b: "Typing this live".getBytes()) {
            System.out.print((char)b);
            Thread.sleep((int) Math.floor(Math.random() * 100));
        }

        for(int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }
}
