package com.soft.demo01;

public class DemoString {
    public static void main(String[] args){
        /*new StringBuffer();//多线程，安全
        new StringBuilder();//单线程，性能高，不安全
        String a= "abc";//final不可变的，在少量简单的字符串使用String
        System.out.println(a + "abc");*/

        StringBuffer sb = new StringBuffer(10);
        sb.append("abc");


    }
}
