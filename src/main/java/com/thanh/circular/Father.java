package com.thanh.circular;

public class Father {
    private final Son son;

    public Father(Son son) {
        this.son = son;
    }

    public void printSon(){
        System.out.println("Son: " + son);
    }
}
