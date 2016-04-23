/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servertp;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;

/**
 *
 * @author gaston.mira
 */
public class ServerTP {

    //private ServerSocket serverSocket;
    private ArrayList<String> listaNoticias = new ArrayList<>();

//    public void showNoticias() {
//        System.out.println("Lista de Noticias del Servidor");
//        for (int i = 0; i < listaNoticias.size(); i++) {
//            System.out.println(listaNoticias.get(i));
//        }
//    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {

        int port = 6006;
        ServerSocket server = new ServerSocket(port);
        System.out.println("Servidor Escuchando por puerto " + String.valueOf(port));

        while (true) {
            Socket clientSocket = server.accept();
            InputStreamReader IR = new InputStreamReader(clientSocket.getInputStream());
            BufferedReader BR = new BufferedReader(IR);
            String message = BR.readLine();
            System.out.println(message);

            //Chequeamos que nos pidio el cliente y contestamos acorde
        }
    }
}
