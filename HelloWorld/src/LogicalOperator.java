public class LogicalOperator {
	public static void main(String[] args) {
		//�񱳿���� �������� ����
		
		//And���� -> �� ���� true�϶��� true -> true�� false -> false��ȯ
		System.out.println((3>2) && (3>4));
		//Or ���� -> �� ���� false�϶��� false -> true�� false -> true��ȯ
		System.out.println((3!=2) || (-1>0));
		//Xor ���� -> �� ���� ���� �ٸ� �� true -> true�� false -> true��ȯ
		System.out.println((3!=2) ^ (-1>0));
	}
}