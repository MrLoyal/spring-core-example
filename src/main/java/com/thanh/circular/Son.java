package com.thanh.circular;

public class Son {
    private Father father;

    public void setFather(Father father) {
        this.father = father;
    }

    public void printFather(){
        System.out.println("Father: " + father);
    }
}
