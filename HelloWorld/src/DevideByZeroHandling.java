//try-catch ����� �̿��Ͽ� ������ 0���� ������ ���
//"0���� ���� �� �����ϴ�"��� ����ϰ� �ٽ� �Է¹޴� ���α׷�

import java.util.Scanner;

public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("�������� �Է��ϼ��� : ");
			int dividend = scanner.nextInt();  //������ �Է�
			
			System.out.print("�������� �Է��ϼ��� : ");
			int divisor = scanner.nextInt();   //������ �Է�
			
			//���ܰ� �߻��� ���ɼ��� �ִ� ���๮
			try {
				System.out.println(dividend + "�� " + divisor + "�� ������ ���� " + dividend/divisor + "�Դϴ�.");
				break;   //�������� ������ �Ϸ� �� while �����.
			}
			
			//����ó���� (���ܰ� ó���� �Ŀ��� �ٽ� try������ �ݺ��Ѵ�)	
			catch(ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�! �ٽ� �Է��ϼ���.");
			}
		}
		
		scanner.close();
	}
}