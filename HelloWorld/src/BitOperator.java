//��Ʈ �� ����� ��Ʈ ����Ʈ ����

public class BitOperator {
	public static void main(String args[]) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		//printf("%04x") -> ���� 4�ڸ��� 16������ ����ϰ�, �� ������ 0�� �����Ѵ�
		System.out.printf("%04x\n" , (short)(a & b));  //AND ����
		System.out.printf("%04x\n" , (short)(a | b));  //OR ����
		System.out.printf("%04x\n" , (short)(a ^ b));  //XOR ����
		System.out.printf("%04x\n" , (short)(~a));     //NOT ����
		
		byte c = 20;   //0x14
		byte d = -8;   //0xf8
		
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c<<2);   //c�� 2��Ʈ ���� ����Ʈ
		//c�� ����̹Ƿ� �ֻ��� ��Ʈ�� 0 ���� -> ������ 4 ȿ��
		System.out.println(c>>2);   //c�� 2��Ʈ ������ ����Ʈ. 0 ����
		//d�� �����̹Ƿ� �ֻ��� ��Ʈ�� 1 ���� -> ������ 4 ȿ��
		System.out.println(d>>2);   //d�� 2��Ʈ ������ ����Ʈ. 1 ����
		//����Ʈ �ÿ� �ֻ��� ��Ʈ�� 0 ���� -> ������ ȿ�� X
		System.out.printf("%x\n", (d >>> 2));
	}
}