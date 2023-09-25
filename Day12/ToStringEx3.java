package javabasic.ch12;

public class ToStringEx3 {

//	@Override
//	public String toString() {
//		return "오버라이딩 예제 입니다.";
//	}

	public static void main(String[] args) {
		ToStringEx3 exam = new ToStringEx3();
		ToStringEx3 exam2 = new ToStringEx3();
		
		System.out.println(exam.toString());
		System.out.println(exam2.toString());
	}

}
