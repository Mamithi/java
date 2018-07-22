package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(9999);

        byte[] bytesReceived = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(
                bytesReceived, bytesReceived.length);
        datagramSocket.receive(datagramPacket);
        String dataFromClient = new String(datagramPacket.getData());

        int num = Integer.parseInt(dataFromClient.trim());
        int result = num * num;


        InetAddress inetAddress = InetAddress.getLocalHost();
        byte[] byteSentToclient = (result + "").getBytes();
        DatagramPacket datagramToClient = new DatagramPacket(
            byteSentToclient, byteSentToclient.length, inetAddress, datagramPacket.getPort()
        );

        datagramSocket.send(datagramToClient);
    }
}
