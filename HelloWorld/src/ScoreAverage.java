//2���� �迭�� �г⺰�� 1,2�б� �������� �����ϰ�, 4�Ⱓ ��ü ���� ��� ���ϱ�

public class ScoreAverage {
	public static void main(String[] args) {
		//4X2 �迭 score�� ������ �־��ش�
		double score[][] = { {3.3, 3.4},   //1�г� 1,2�б� ���� 
							{3.5, 3.6},    //2�г� 1,2�б� ����
							{3.7, 4.0},    //3�г� 1,2�б� ����
							{4.1, 4.2} };  //4�г� 1,2�б� ����
		
		double sum = 0;  //������ ���ϱ� ���� �հ躯�� ����
		
		//score.length = 4, score[0].length = 2
		//2�� �ݺ��� -> ù��° �ݺ��� : �迭 ���پ� �б�, �ι�° �ݺ��� : �ش� �迭�� ���� �б�
		for(int year = 0; year < score.length; year++)
			for(int term = 0; term < score[year].length; term++)
				sum += score[year][term];  //��ü ������ ��
		
		int n = score.length;  //�迭�� �� ����, 4(4�г�)
		int m = score[0].length;  //�迭�� �� ����, 2(2�б�)
		System.out.println("4�� ��ü ���� ����� " + sum/(n*m) + "�Դϴ�.");
	}
}