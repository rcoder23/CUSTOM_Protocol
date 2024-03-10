// TCPServer.java
package org.example.socket;

import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        int serverPort = 1234;

        try (ServerSocket serverSocket = new ServerSocket(serverPort)) {
            System.out.println("Server started. Waiting for client...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                     PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    String inputLine;
                    while ((inputLine = in.readLine()) != null) {
                        String encoded = Handler.encode(inputLine);
//                        System.out.println("Encoded: " + encoded);
                        System.out.println("Received from client: " + inputLine);
                        String outputLine = " RESPONSE: " + encoded +"\n";
                        out.println(outputLine);
                    }
                } catch (IOException e) {
                    System.err.println("Error handling client connection: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("Error starting server: " + e.getMessage());
        }
    }
}
