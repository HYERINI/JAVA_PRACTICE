//���� 4���� ������ ������ �迭�� �����ϰ�
//1,2,3,4�� �ʱ�ȭ�� ����
//�迭�� �����ϴ� makeArray()�� �ۼ��ϰ�
//�� �޼ҵ�κ��� �迭�� ���޹޾� ���� ����ϴ� ���α׷�

public class ReturnArray {
	static int[] makeArray() {  //������ �迭�� �����ϴ� �޼ҵ�
		int temp[] = new int[4];  //�迭����
		for (int i = 0; i < temp.length; i++)  //�迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ 
			temp[i] = i;  //�迭�� ���Ҹ� 0,1,2,3���� �ʱ�ȭ 
		return temp;  //�迭 ����
	}
	
	public static void main (String[] args) {
		int intArray[];   //�迭 ���۷��� ���� ����
		intArray = makeArray();  //�޼ҵ�κ��� �迭 ���޹���
		for(int i = 0; i < intArray.length; i++)
			System.out.print(intArray[i] + " ");  //�迭 ��� ���� ���
	}
}