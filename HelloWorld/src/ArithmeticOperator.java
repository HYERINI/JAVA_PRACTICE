//초단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지 출력하는 프로그램

import java.util.Scanner;   //scanner 사용 위한 import문 선언

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //System.in을 통해 사용자에게 입력받기 위한 scanner 사용
		
		System.out.print("정수를 입력하세요");
		int time = scanner.nextInt();  //입력한 정수를 time에 넣어준다
		int second = time % 60;   //60으로 나눈 나머지 = 초
		int minute = (time / 60) % 60; //60으로 나눈 몫을 다시 60으로 나눈 수 = 분
		int hour = (time / 60) / 60; //60으로 나눈 몫을 60으로 나눈 몫 = 시간
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute + "분, ");
		System.out.print(second + "초입니다.");
		
		scanner.close();   //scanner 닫기
		
	}
}