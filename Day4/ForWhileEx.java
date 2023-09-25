package javabasic.ch05;

public class ForWhileEx {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("합계 : "+sum);
		System.out.println();
		
		
		int sum1 = 0;
		int i = 1;
		
		while (i <= 100) {
			sum1 += i;
			i++;
		}
		
		System.out.println("합계 : "+sum1);
	}
}