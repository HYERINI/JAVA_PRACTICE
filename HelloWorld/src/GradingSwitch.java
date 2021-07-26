//switch문을 통해 학점 매기기

import java.util.Scanner;    //scanner을 사용하기 위한 import문 선언

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    //System.in을 통해 scanner 사용해 사용자에게 입력받는다.
		
		char grade;
		System.out.print("점수를 입력하세요(0~100) : ");  //출력
		int score = scanner.nextInt();   //입력한 내용을 int형으로 변환한 후, score에 넣어준다
		
		//switch문 사용
		switch(score/10) {
			case 10: //100점
			case 9:  //90~99점
				grade = 'A';
				break;
			case 8:  //80~89점
				grade = 'B';
				break;
			case 7:  //70~79점
				grade = 'C';
				break;
			case 6:  //60~69점
				grade = 'D';
				break;							
			default: //0~59점		
				grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
		scanner.close();
	}
}