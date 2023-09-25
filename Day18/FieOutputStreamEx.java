package javabasic.ch18;

import java.io.FileOutputStream;
import java.io.IOException;

public class FieOutputStreamEx {

	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = 
					new FileOutputStream("test.txt");
//					new FileOutputStream("test.txt", true);
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
//			fos.write(68);
//			fos.write(69);
//			fos.write(70);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
