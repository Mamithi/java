package com.mamithi;

import javax.swing.*;

public class DatagramClientTest {
    public static void main(String[] args){
        DatagramClient application = new DatagramClient();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.waitForPackets();
    }
}
