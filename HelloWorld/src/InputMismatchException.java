//[[입력 오류 시 발생하는 예외-InputMismatchException]]
//3개의 정수를 입력받아 합을 구하는 프로그램
// 사용자가 정수가 아닌 문자를 입력할 때 발생하는 예외를 처리해 다시 입력받도록 한다.
//뭔 오류인건지 파악 불가능

import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i = 0; i < 3; i++) {
			System.out.println(i + ">>");
			try {
				//사용자가 정수가 아닌 문자를 입력하면 예외발생
				n = scanner.nextInt(); // 정수입력
			}
			catch(InputMismatchException e) { 
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				scanner.nextLine();  //현재 입력 스트림에 남아 있는 토큰을 지운다.
				i--;  //인덱스가 증가하지 않도록 미리 감소
				continue;  //다음 루프
			}
			sum += n;  //합하기
		}
		System.out.println("합은 " + sum);
		scanner.close();
	}
}