package com.driver;

public class Main {
    public static void main(String []args){

        RWOnly obj = new RWOnly();
        //obj.name = "tom";
        //System.out.println(obj.name);
        // Error -> 'name' has private access
        String name = "tom";
        obj.setName(name);
        System.out.println(obj.getName());
    }
  
}