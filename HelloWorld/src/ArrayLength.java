//�迭�� length�ʵ带 �̿��Ͽ� �迭 ũ�⸸ŭ ������ �Է¹ް� ����� ���ϴ� ���α׷�

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];   //�迭 ����� ���ÿ� ����
		int sum = 0;  //���� ������ ���� sum �ʱ�ȭ
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ��� : ");
		//�ݺ����� ���� ����ڰ� �Է��� ������ intArray�迭�� ����
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();     
		}
		//�ݺ����� ���� intArray�� ��� ������ ���� ���Ѵ�
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.print("����� " + (double)sum/intArray.length + "�Դϴ�.");
		scanner.close();
	}
	
}