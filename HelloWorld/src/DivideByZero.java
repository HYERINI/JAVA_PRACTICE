//두 정수를 입력받아 나눗셈을 하고 몫을 구하는 프로그램 코드
//사용자가 나누는 수에 0을 입력하면 ArithmeticException 예외가 발생해 프로그램이 강제 종료된다.

import java.util.Scanner;  //Scanner 사용을 위한 import문 선언

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;  //나뉨수
		int divisor;   //나눗수
		
		System.out.print("나뉨수를 입력하세요 : ");
		dividend = scanner.nextInt();   //입력한 수 읽기(나뉨수)
		
		System.out.print("나눗수를 입력하세요 : ");
		divisor = scanner.nextInt();    //입력한 수 읽기(나눗수)
		
		//dividend/divisor에서 divisor이 0이면 예외 발생 
		System.out.println(dividend+ "를 " + divisor + "로 나누면 몫은 " + dividend/divisor + "입니다.");
		
		scanner.close();
	}
}

//예외발생하면
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at DivideByZero.main(DivideByZero.java:19)