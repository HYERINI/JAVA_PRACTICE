//2차원 배열에 학년별로 1,2학기 성적으로 저장하고, 4년간 전체 평점 평균 구하기

public class ScoreAverage {
	public static void main(String[] args) {
		//4X2 배열 score에 점수를 넣어준다
		double score[][] = { {3.3, 3.4},   //1학년 1,2학기 성적 
							{3.5, 3.6},    //2학년 1,2학기 성적
							{3.7, 4.0},    //3학년 1,2학기 성적
							{4.1, 4.2} };  //4학년 1,2학기 성적
		
		double sum = 0;  //평점을 구하기 위한 합계변수 선언
		
		//score.length = 4, score[0].length = 2
		//2중 반복문 -> 첫번째 반복문 : 배열 한줄씩 읽기, 두번째 반복문 : 해당 배열의 원소 읽기
		for(int year = 0; year < score.length; year++)
			for(int term = 0; term < score[year].length; term++)
				sum += score[year][term];  //전체 평점의 합
		
		int n = score.length;  //배열의 행 개수, 4(4학년)
		int m = score[0].length;  //배열의 열 개수, 2(2학기)
		System.out.println("4년 전체 평점 평균은 " + sum/(n*m) + "입니다.");
	}
}