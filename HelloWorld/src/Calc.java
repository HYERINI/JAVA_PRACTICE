//����ڰ� ����� ���ڷ� �Է��� �Ǽ����� main() �޼ҵ忡�� ���޹޾� ���� ���ϴ� ���α׷�

public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++)   //arg.length = ����� ������ ����  -> ����� ���� ���� ��ŭ �ݺ��Ѵ� 
			sum += Double.parseDouble(args[i]);  //���ڿ��� �Ǽ� Ÿ������ ��ȯ�Ͽ� �ջ�
		
		System.out.println("sum = " + sum);
	}
}

//cmd���� src ������ ���� ��ġ�� �Ű��� ����
//javac Calc.java
//java Calc 2 20.5 88.1
//�Է��ϸ�
//sum = 110.6 �̶�� ����� ����