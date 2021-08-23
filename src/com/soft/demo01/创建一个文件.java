package com.soft.demo01;

import java.io.*;
import java.util.Arrays;

public class 创建一个文件 {
    public static void main(String[] args) throws IOException {
        //1.使用File创建
        //文件存不存在都不会出错,这是创建一个file对象
        File file = new File("/Users/oldyang/Desktop/demo01.txt");
        System.out.println(file);

        //2.new File("父目录",文件名)
        File file1 = new File("/Users/oldyang/Desktop/", "demo02.txt");
        System.out.println(file1);

        //3.new File(dirFile,文件名)
        File dirFile = new File("/Users/oldyang/Desktop/");
        File file2 = new File(dirFile, "demo02.txt");
        System.out.println(file2);




        //得到路径
        String path = file.getPath();
        System.out.println(path);
        System.out.println(file.getAbsolutePath());

        //得到名字
        System.out.println(file.getName());
        System.out.println(file.length());//字节的长度

        //相对路径与绝对路径
        //绝对路径
        //mac/linux/unix-->以/根目录开始的路径称为绝对路径
        //windows以盘符开始的C:D:
        //相对路径
        //以前的文件的位置,./代表当前目录,../上一层目录

        //System.out.println(Arrays.toString("12.1*1".split("[+\\-*/]")));

        //判断文件是否存在,今后为了io做准备,如果使用io读取的文件不存在会报错

        //ctrl+B:查看file所处的位置
        //ctrl+alt+左右:上一次跟下一次的编辑位置
        if (file1.exists()) {
            System.out.println("文件存在");

        }else {
            System.out.println("文件不存在!");
        }

        //判断是文件还是目录
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        //alt+鼠标:列编辑
        //ctrl+w:选中单词
        System.out.println(dirFile.isFile());
        System.out.println(dirFile.isDirectory());

        //创建一个文件
        File file3 = new File("test01.txt");
        //file3.createNewFile();//创建一个空白文件
        boolean delete = file3.delete();
        System.out.println(delete);

        //目录
//        mkdir只能创建一级目录
        //个人建议后期创建目录 使用直接 使用mkdirs
        File file4 = new File("cccc");
        System.out.println(file4.mkdirs());

        System.out.println("***************************************");
        //得目录里面的内容
        File file5 = new File("aaa");
        /*String[] list = file5.list();
        for (String s : list) {
            System.out.println(s);
        }*/
      /*  File[] files = file5.listFiles();
        for (File temp : files) {
            System.out.println(temp.getName());
            System.out.println(temp.isDirectory());
        }*/

        //过滤器,了解
        File[] files = file5.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                //只显示文件
                //boolean show = pathname.isFile();
                //只想显示mp4
                boolean show = pathname.getName().endsWith(".mp4");
                return show;//控制返回的数据
            }
        });

        for (File temp : files) {
            System.out.println(temp.getName());
        }


    }
}
