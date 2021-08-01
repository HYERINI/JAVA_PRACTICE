//�迭�� �ε����� ������ ��� �� �߻��ϴ� ArrayIndexOutOfBoundsException�� ó���ϴ� ���α׷�

public class ArrayException {
	public static void main(String[] args) {	
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		//���ܰ� �߻��� ���ɼ��� �ִ� ���๮
		try {
			for (int i = 0; i < 5; i++) {
				intArray[i+1] = i + 1 + intArray[i];  //i=4�� ��� ���� �߻�(i+1�� �ϸ� �迭�� ũ���� 5�� ����� �Ǳ� ����)
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		}
		
		//����ó���� (���ܰ� �߻��ϸ� �ٽ� try���� �����Ѵ�)
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε����� ������ ������ϴ�.");
		}
	}
}