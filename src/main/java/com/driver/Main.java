package com.driver;

public class Main {
    public static void main(String []args){

        RWOnly obj = new RWOnly();
        //obj.name = "tom";
        //System.out.println(obj.name);
        // Error -> 'name' has private access
        String name = "tom";
        obj.setter(name);
        System.out.println(obj.getter());
    }
  
}