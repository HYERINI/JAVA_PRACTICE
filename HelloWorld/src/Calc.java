//사용자가 명령행 인자로 입력한 실수들을 main() 메소드에서 전달받아 합을 구하는 프로그램

public class Calc {
	public static void main(String[] args) {
		double sum = 0.0;
		
		for (int i = 0; i < args.length; i++)   //arg.length = 명령행 인자의 개수  -> 명령행 인자 개수 만큼 반복한다 
			sum += Double.parseDouble(args[i]);  //문자열을 실수 타입으로 변환하여 합산
		
		System.out.println("sum = " + sum);
	}
}

//cmd에서 src 폴더로 현재 위치를 옮겨준 다음
//javac Calc.java
//java Calc 2 20.5 88.1
//입력하면
//sum = 110.6 이라는 결과가 나옴