package com.jpa.hibernate.test;

public abstract class AbstractTest implements Abs{

    public int total;

    protected abstract void test();

    @Override
    public void sum() {
        total = 100;
    }

    public void print(){
        System.out.println("Test print total = " + total);
    }

}
