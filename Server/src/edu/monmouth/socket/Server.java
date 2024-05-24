package edu.monmouth.socket;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.io.PrintWriter;

public class Server {
	public static void main (String[] args)  throws IOException {
		int port = 3000;
	try (ServerSocket serverSocket = new ServerSocket(port)) {
		Socket clientsocket = serverSocket.accept();
		   InetAddress Ip1 = clientsocket.getInetAddress();
		   String Ip2 = Ip1.getHostAddress();
		   
		   try (
		PrintWriter os = new PrintWriter(clientsocket.getOutputStream(), true)) {
		 os.println("Pleased to meet you " + Ip2 + " at port " + port);
		 serverSocket.close();
	}
}
}
}