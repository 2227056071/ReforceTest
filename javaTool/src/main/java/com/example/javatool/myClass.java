package com.example.javatool;

import java.io.File;

public class myClass {
    public static void main(String[] args)
    {
        File sourceApk = new File("source.apk");
        if (!sourceApk.exists())
        {
            System.out.println("source.apk not existed");
        }
    }
}
