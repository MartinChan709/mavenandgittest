package com.test;

import java.io.*;



public class TestStream {
    public static void main(String[] args) {
        File file=new File("c:/1.jpg");

        File toFile=new File("c:/2.jpg");

        FileInputStream fileInputStream= null;

        FileOutputStream fileOutputStream= null;

        BufferedInputStream bufferedInputStream=null;

        BufferedOutputStream bufferedOutputStream=null;
        try {
            fileInputStream = new FileInputStream(file);
            bufferedInputStream=new BufferedInputStream(fileInputStream);
            fileOutputStream = new FileOutputStream(toFile);
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            int a;
            long begin= System.currentTimeMillis();
            while((a=bufferedInputStream.read())!=-1)
                bufferedOutputStream.write(a);
            long end= System.currentTimeMillis();
            System.out.println("用时："+(end-begin));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedInputStream.close();
                bufferedOutputStream.close();
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
