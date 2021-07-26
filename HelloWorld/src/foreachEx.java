//for-each문 사용해보기

public class foreachEx {
	enum Week {월, 화, 수, 목, 금, 토, 일}    //나열 타입 Week 선언
	
	public static void main(String[] args) {
		int [] n = { 1, 2, 3, 4, 5};  //정수형 배열 n 선언
		String names[] = { "사과", "배", "바나나", "체리", "딸기", "포도"}; //문자열 배열 names 선언
		
		int sum = 0;   //합을 저장할 변수 sum 선언 
		
		//아래 for-each에서 k는 n[0], n[1], ..., n[4]로 반복
		for (int k : n) {
			System.out.print(k + " ");  //반복되는 k값 출력
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		//아래 for-each에서 s는 names[0], names[1], ..., names[5]로 반복
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
		
		//아래 for-each에서 day는 월, 화, 수, 목, 금, 토, 일 값으로 반복
		for (Week day : Week.values()) 
			System.out.print(day + "요일 ");
		System.out.println();
	}
}