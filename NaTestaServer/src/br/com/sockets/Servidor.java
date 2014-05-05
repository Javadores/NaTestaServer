package br.com.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket servidor = new ServerSocket(12345);
		
		Socket cliente =  servidor.accept();
		
		Scanner scanner = new Scanner(cliente.getInputStream());
		
		while(scanner.hasNextLine()){
			System.out.println(scanner.nextLine());
		}
		
		scanner.close();
		cliente.close();
		servidor.close();
		
	}

}
