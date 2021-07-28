public class SkewedArray {
	public static void main(String args[]) {
		int intArray[][] = new int[4][];   //각 행의 레퍼런스 배열 생성
		intArray[0] = new int[3];  //첫째 행의 정수 3개의 배열 생성
		intArray[1] = new int[4];  //둘째 행의 정수 4개의 배열 생성
		intArray[2] = new int[2];  //셋째 행의 정수 2개의 배열 생성
		intArray[3] = new int[5];  //넷째 행의 정수 5개의 배열 생성
		
		//이중 반복문을 통해 2차원 배열에 원소를 넣어준다.
		for(int i = 0; i < intArray.length; i++)   //행에 대한 반복
			for(int j = 0; j < intArray[i].length; j++)  //열에 대한 반복
				intArray[i][j] = (i+1)*10 + j;
		
		//이중 반복문을 통해 2차원 배열의 원소를 출력해준다.
		for(int i = 0; i < intArray.length; i++)
			for(int j = 0; j < intArray[i].length; j++)
				System.out.print(intArray[i][j] + " ");
			System.out.println();   //다음 줄로 넘어가기 안됨
	}
}