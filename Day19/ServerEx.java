package javabasic.ch19;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {

	public static void main(String[] args) {
		
		// 소켓 생성
		ServerSocket server = null;
					
		try {
			
			server = new ServerSocket(9999);
			
			// 무한 반복 (클라이언트 접속 대기)
			while(true) {
				System.out.println("클라이언트 접속 대기");
				Socket client = server.accept();
				System.out.println("스레드 생성");
				HttpThread ht = new HttpThread(client);
				ht.start();
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				server.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}

class HttpThread extends Thread {
	private Socket client;
	BufferedReader br;
	PrintWriter pw;
	HttpThread(Socket client) {
		this.client = client;
		try {
			br = new BufferedReader (new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	public void run() {
		BufferedReader fbr = null;
		DataOutputStream outToClient = null;
		try {
			String line = br.readLine();
			//line : GET / HTTP/1.1
			System.out.println("Http Header :"+line);
			int start = line.indexOf("/") + 1;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName=line.substring(start,end);
			if(fileName.equals("")) {
				fileName="index.html";
			}
			System.out.println("사용자 요청 파일 :"+fileName);
			fbr = new BufferedReader (new FileReader(fileName));
			String fileLine = null;
			pw.println("HTTP/1.0 200 Document Follows \r\n");
			while((fileLine = fbr.readLine())!=null){
				pw.println(fileLine);
				pw.flush();
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(client != null) client.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
