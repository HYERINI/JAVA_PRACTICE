//배열에 입력받은 수 중 제일 큰 수 찾기

import java.util.Scanner;    //scanner을 사용하기 위한 import문 선언

public class ArrayAccess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //사용자에게 입력받기
		
		int intArray[] = new int [5];	//배열의 선언과 동시에 생성
		int max = 0;   //현재 가장 큰 수
		System.out.println("양수 5개를 입력하세요.");  //출력
		
		//반복문 사용해 사용자가 입력한 양수 5개를 max와 비교하며 제일 큰 수를 max에 저장한다.
		for(int i = 0; i < 5; i++) {
			intArray[i] = scanner.nextInt();   //사용자가 입력한 양수를 하나씩 읽어 배열에 저장한다.
			if(intArray[i] > max) 
				max = intArray[i];   //입력한 양수가 max보다 크면 intArray[i]를 max로 변경
		}
		System.out.println("입력한 수 중 가장 큰 수는 " + max + "입니다.");
		
		scanner.close();
		
	}
}