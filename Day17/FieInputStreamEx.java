package javabasic.ch18;

import java.io.FileInputStream;
import java.io.IOException;

public class FieInputStreamEx {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = 
					new FileInputStream("src/javabasic/ch18/InputStreamEx.java");
			int data = 0;
			while((data=fis.read()) != -1) {
				System.out.print((char)data);
			}
		} catch (IOException e) {
			
		}

	}

}
