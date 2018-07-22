package com.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) throws Exception {
        String ipAddress = "localhost";
        int portNumber = 9999;
        Socket socket = new Socket(ipAddress, portNumber);

        String data = "Lawrence Mamithi";

        OutputStreamWriter outStreamData = new OutputStreamWriter(socket.getOutputStream());
        PrintWriter outStream = new PrintWriter(outStreamData);
        outStream.println(data);
        outStream.flush();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String dataFromServer = bufferedReader.readLine();

        System.out.println("C: Data from server " + dataFromServer);


    }
}
