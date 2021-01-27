package com.thanh.lazy;

public class RunningMan {

    private final Sloth sloth;

    public RunningMan(Sloth sloth) {
        this.sloth = sloth;
    }

    public void run(){
        System.out.println("I have a sloth: " + sloth);
    }
}
