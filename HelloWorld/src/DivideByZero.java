//�� ������ �Է¹޾� �������� �ϰ� ���� ���ϴ� ���α׷� �ڵ�
//����ڰ� ������ ���� 0�� �Է��ϸ� ArithmeticException ���ܰ� �߻��� ���α׷��� ���� ����ȴ�.

import java.util.Scanner;  //Scanner ����� ���� import�� ����

public class DivideByZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dividend;  //������
		int divisor;   //������
		
		System.out.print("�������� �Է��ϼ��� : ");
		dividend = scanner.nextInt();   //�Է��� �� �б�(������)
		
		System.out.print("�������� �Է��ϼ��� : ");
		divisor = scanner.nextInt();    //�Է��� �� �б�(������)
		
		//dividend/divisor���� divisor�� 0�̸� ���� �߻� 
		System.out.println(dividend+ "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
		
		scanner.close();
	}
}

//���ܹ߻��ϸ�
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//		at DivideByZero.main(DivideByZero.java:19)