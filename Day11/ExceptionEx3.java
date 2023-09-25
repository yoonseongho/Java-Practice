package javabasic.ch11;

public class ExceptionEx3 {

	public static void main(String[] args) {
		
		try {
			int[] arr = {1,2,3};
			System.out.println(arr[3]);
			System.out.println(3/0);
			Integer.parseInt("a");
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과");
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
				
		
//		System.out.println("DB연결 시작");
//		try {
//			System.out.println("DB작업");
//		} catch(Exception e) {
//			System.out.println("DB작업 중 예외발생");
//		} finally {
//			System.out.println("DB연결 종료");
//		}
	}

}
