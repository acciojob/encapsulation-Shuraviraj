package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        //        System.out.println(obj.num);
        // java: num has private access in com.driver.RWOnly

        obj.setName("Test");
        System.out.println(obj.getName());
    }
}