//배열의 length필드를 이용하여 배열 크기만큼 정수를 입력받고 평균을 구하는 프로그램

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		int intArray[] = new int[5];   //배열 선언과 동시에 생성
		int sum = 0;  //합을 저장할 변수 sum 초기화
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(intArray.length + "개의 정수를 입력하세요 : ");
		//반복문을 통해 사용자가 입력한 정수를 intArray배열에 저장
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();     
		}
		//반복문을 통해 intArray의 모든 원소의 합을 구한다
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
		System.out.print("평균은 " + (double)sum/intArray.length + "입니다.");
		scanner.close();
	}
	
}