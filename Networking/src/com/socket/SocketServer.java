package com.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) throws Exception {
        System.out.println("S: Server is started");

        ServerSocket serverSocket = new ServerSocket(9999);

        System.out.println("S: Server is waiting for client request");
        Socket socket = serverSocket.accept();

        System.out.println("S: Client connected");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String dataRead = bufferedReader.readLine();

        System.out.println("S: Client Data: " + dataRead);

        String clientData = dataRead.substring(0, 3);

        OutputStreamWriter outStreamData = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter outStream = new PrintWriter(outStreamData);
        outStream.println(clientData);
        outStream.flush();

        System.out.println("S: Data sent from server to client");
    }
}
