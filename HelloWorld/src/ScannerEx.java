import java.util.Scanner;   //scanner��ü�� ����ϱ� ���� import�� ����
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��Ͻÿ�");
		Scanner scanner = new Scanner(System.in); //����ڿ��� �Է¹ޱ�
		
		String name = scanner.next();  //���ڿ��б�
		System.out.println("�̸��� " + name + ",");
		
		String city = scanner.next();
		System.out.println("���ô� " + city + ",");
		
		int age = scanner.nextInt();  //���� �б�
		System.out.println("���̴� " + age + ",");
		
		double weight = scanner.nextDouble();  //�Ǽ� �б�
		System.out.println("ü���� " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean();  //���� �б�
		System.out.println("���ſ��δ� " + isSingle + "�Դϴ�.");
		
		scanner.close();  //scanner ��ü �ݱ�
	}
}