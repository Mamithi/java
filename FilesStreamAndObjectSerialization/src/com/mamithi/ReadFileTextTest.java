package com.mamithi;

public class ReadFileTextTest {
    public static void main(String[] args){
        ReadTextFile application = new ReadTextFile();

        application.openFile();
        application.readRecords();
        application.closeFile();
    }
}
