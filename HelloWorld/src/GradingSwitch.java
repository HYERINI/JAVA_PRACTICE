//switch���� ���� ���� �ű��

import java.util.Scanner;    //scanner�� ����ϱ� ���� import�� ����

public class GradingSwitch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);    //System.in�� ���� scanner ����� ����ڿ��� �Է¹޴´�.
		
		char grade;
		System.out.print("������ �Է��ϼ���(0~100) : ");  //���
		int score = scanner.nextInt();   //�Է��� ������ int������ ��ȯ�� ��, score�� �־��ش�
		
		//switch�� ���
		switch(score/10) {
			case 10: //100��
			case 9:  //90~99��
				grade = 'A';
				break;
			case 8:  //80~89��
				grade = 'B';
				break;
			case 7:  //70~79��
				grade = 'C';
				break;
			case 6:  //60~69��
				grade = 'D';
				break;							
			default: //0~59��		
				grade = 'F';
		}
		System.out.println("����� ������ " + grade + "�Դϴ�.");
		scanner.close();
	}
}