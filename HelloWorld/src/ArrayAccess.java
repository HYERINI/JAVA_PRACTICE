//�迭�� �Է¹��� �� �� ���� ū �� ã��

import java.util.Scanner;    //scanner�� ����ϱ� ���� import�� ����

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //����ڿ��� �Է¹ޱ�
		
		int intArray[] = new int [5];	//�迭�� ����� ���ÿ� ����
		int max = 0;   //���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");  //���
		
		//�ݺ��� ����� ����ڰ� �Է��� ��� 5���� max�� ���ϸ� ���� ū ���� max�� �����Ѵ�.
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();   //����ڰ� �Է��� ����� �ϳ��� �о� �迭�� �����Ѵ�.
			if(intArray[i] > max) 
				max = intArray[i];   //�Է��� ����� max���� ũ�� intArray[i]�� max�� ����
		}
		System.out.println("�Է��� �� �� ���� ū ���� " + max + "�Դϴ�.");
		
		scanner.close();
		
	}
}