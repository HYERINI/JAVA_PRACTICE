//�ʴ����� ������ �Է¹ް�, �� �ð�, �� ��, �� ������ ����ϴ� ���α׷�

import java.util.Scanner;   //scanner ��� ���� import�� ����

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //System.in�� ���� ����ڿ��� �Է¹ޱ� ���� scanner ���
		
		System.out.print("������ �Է��ϼ���");
		int time = scanner.nextInt();  //�Է��� ������ time�� �־��ش�
		int second = time % 60;   //60���� ���� ������ = ��
		int minute = (time / 60) % 60; //60���� ���� ���� �ٽ� 60���� ���� �� = ��
		int hour = (time / 60) / 60; //60���� ���� ���� 60���� ���� �� = �ð�
		
		System.out.print(time + "�ʴ� ");
		System.out.print(hour + "�ð�, ");
		System.out.print(minute + "��, ");
		System.out.print(second + "���Դϴ�.");
		
		scanner.close();   //scanner �ݱ�
		
	}
}