public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);  //b�� intŸ������ �ڵ���ȯ
		System.out.println(10.0/4); //4�� 4.0���� �ڵ���ȯ
		System.out.println((char)0x12340041); //���� 'A'
		//b+i�� 227, 16���� 0xE3, �� -29
		System.out.println((byte)(b+i)); //biteŸ������ ��������ȯ
		System.out.println((int)2.9 + 1.8); //2.9�� intŸ������ ��������ȯ
		System.out.println((int)(2.9 + 1.8)); //���� ���� intŸ������ ��������ȯ
		System.out.println((int)2.9 + (int)1.8); //���� intŸ������ ��ȯ �� ����
	}
}