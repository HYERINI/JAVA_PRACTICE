public class CircleArea {
	public static void main(String[] args) {
		final double PI = 3.141592; //원주율을 상수로 선언
		
		double radius = 10.0;
		double circleArea = radius*radius*PI; //원의 면적 계산
		
		System.out.println("원의 면적 = " + circleArea);
	}
}