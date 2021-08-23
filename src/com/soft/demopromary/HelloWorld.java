package com.soft.demopromary;

//表示一个公开的类，名字叫HelloWorld
public class HelloWorld{
    //类体
    //类体中不允许直接编译Java语句（除申明变量以外）

    //定义变量(必须给值，初始化定义变量)
    int a = 10;
    boolean bb1 = true;

    public static void main(String[] args) {
        //方法体
        //可以编写多条Java语句
        System.out.println("HelloWorld");//向控制台输出一段字符串
        //Java中字符串都用双引号“ ”括起来
    }
}
    /*字面值就是数据：
    整数型字面值：10、100
    浮点型字面值：3.14
    字符串型字面值：“abc”
    字符型字面值：‘a’
    布尔型字面值：true、false
     */

     /*基本数据类型
     整型：byte\short\int\long
     浮点型：float\double
     字符型：char
     布尔型：boolean
     */

    //变量的位置划分为：类变量；实例变量；局部变量；
    class Variable{
        static int allClicks=0;//类变量（静态变量）：用static修饰
        String str="HelloWorld";//实例变量：没有static修饰
        private boolean bb1;

        public void method(){
            int i=0;//局部变量：类中的变量，必须初始化赋值才可以使用


            //boolean
            //boolean bb1 = true;
            System.out.println(bb1);

            boolean isMarried = true;
            if (isMarried){
                System.out.println("嗯嗯");
            }else {
                System.out.println("不是的");
            }
        }

    }


