package javabasic.ch03;

public class OpEx2 {
	public static void main(String[] args) {
		
		int a = 5 + 5;
		System.out.println("5 + 5 = "+a);	// 10출력
		int b = a - 5;
		System.out.println("10 - 5 = "+b);	// 5출력
		int c = b * 2;
		System.out.println("5 * 2 = "+c);	// 10출력
		int d = c / 5;
		System.out.println("10 / 5 = "+d);	// 2출력
		
		// 나머지 연산
		int e = 10 % 3;	// 10 나누기 3의 결과값은 몫이 3, 나머지 1
		System.out.println("10 % 3 = "+e);

	}
}