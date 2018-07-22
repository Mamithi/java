package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket();

        int dataSent = 90;
        byte[] byteSent = String.valueOf(dataSent).getBytes();


        InetAddress inetAddress = InetAddress.getLocalHost();

        DatagramPacket datagramPacket = new DatagramPacket(
                byteSent, byteSent.length, inetAddress, 9999);

        datagramSocket.send(datagramPacket);

        byte[] bytesFromServer = new byte[1024];
        DatagramPacket datagramPacketReceived = new DatagramPacket(
                bytesFromServer, bytesFromServer.length
        );

        datagramSocket.receive(datagramPacketReceived);

        String dataReceived = new String(datagramPacketReceived.getData());

        System.out.println("result is  " + dataReceived.trim());
    }
}
