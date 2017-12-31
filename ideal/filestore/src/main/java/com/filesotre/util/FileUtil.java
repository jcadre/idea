package com.filesotre.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by JC on 2017/12/17.
 * 文件工具类
 */
public class FileUtil {
    public static void main(String[] args){
        System.out.println("SecurityManager: " + System.getSecurityManager());
        try {
            FileInputStream fis = new FileInputStream("d:\\a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(System.getProperty("file.encoding"));
    }
}
