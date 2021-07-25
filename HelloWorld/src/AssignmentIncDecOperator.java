//대입 연산자와 증감 연산자 활용하기
public class AssignmentIncDecOperator {
	public static void main(String[] args) {
		int a = 3, b = 3, c = 3;
		
		a += 3;  //a = 6
		b *= 3;  //b = 9
		c %= 2;  //c = 1
		
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		
		int d = 3;
		
		//증감 연산자 사례
		a = d++;   //a = 3, d = 4 (d를 1 증가시키고, 증가 전의 값 반환)
		System.out.println("a = " + a + ", d = " + d);
		
		a = ++d;   //a = 5, d = 5 (d를 1 증가시키고, 증가된 값 반환)
		System.out.println("a = " + a + ", d = " + d);
		
		a = d--;   //a = 5, b = 4 (d를 1 감소시키고, 감소 전의 값 반환)
		System.out.println("a = " + a + ", d = " + d);
		
		a = --d;   //a = 3, d = 3 (d를 1 감소시키고, 감소된 값 반환)
		System.out.println("a = " + a + ", d = " + d);		
	}
}