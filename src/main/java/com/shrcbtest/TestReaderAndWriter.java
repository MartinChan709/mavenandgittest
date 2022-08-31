package com.shrcbtest;

import java.io.*;


public class TestReaderAndWriter {
    public static void main(String[] args) {
        File file=new File("c:/1.jpg");

        File toFile=new File("d:/3.jpg");

        FileReader fileReader= null;

        FileWriter fileWriter= null;

        BufferedReader bufferedReader=null;

        BufferedWriter bufferedWriter=null;
        try {
            fileReader = new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            fileWriter = new FileWriter(toFile);
            bufferedWriter=new BufferedWriter(fileWriter);
            int a;
            long begin= System.currentTimeMillis();
            while((a=bufferedReader.read())!=-1)
                bufferedWriter.write(a);
            long end= System.currentTimeMillis();
            System.out.println("用时："+(end-begin));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                bufferedWriter.close();
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
