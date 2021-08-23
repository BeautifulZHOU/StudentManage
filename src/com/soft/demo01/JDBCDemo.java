package com.soft.demo01;



import java.sql.DriverManager;

public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.加载驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //forName要抛出异常
        //2.注册
        //3.获取连接
        //4.操作数据
        //5.关闭
    }
}
