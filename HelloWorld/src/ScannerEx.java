import java.util.Scanner;   //scanner객체를 사용하기 위한 import문 선언
public class ScannerEx {
	public static void main(String[] args) {
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하시오");
		Scanner scanner = new Scanner(System.in); //사용자에게 입력받기
		
		String name = scanner.next();  //문자열읽기
		System.out.println("이름은 " + name + ",");
		
		String city = scanner.next();
		System.out.println("도시는 " + city + ",");
		
		int age = scanner.nextInt();  //정수 읽기
		System.out.println("나이는 " + age + ",");
		
		double weight = scanner.nextDouble();  //실수 읽기
		System.out.println("체중은 " + weight + ",");
		
		boolean isSingle = scanner.nextBoolean();  //논리값 읽기
		System.out.println("독신여부는 " + isSingle + "입니다.");
		
		scanner.close();  //scanner 객체 닫기
	}
}