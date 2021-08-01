//배열의 인덱스가 범위를 벗어날 때 발생하는 ArrayIndexOutOfBoundsException을 처리하는 프로그램

public class ArrayException {
	public static void main(String[] args) {	
		int[] intArray = new int[5];
		intArray[0] = 0;
		
		//예외가 발생할 가능성이 있는 실행문
		try {
			for (int i = 0; i < 5; i++) {
				intArray[i+1] = i + 1 + intArray[i];  //i=4인 경우 예외 발생(i+1을 하면 배열의 크기인 5를 벗어나게 되기 때문)
				System.out.println("intArray[" + i + "]" + "=" + intArray[i]);
			}
		}
		
		//예외처리문 (예외가 발생하면 다시 try문을 실행한다)
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스가 범위를 벗어났습니다.");
		}
	}
}