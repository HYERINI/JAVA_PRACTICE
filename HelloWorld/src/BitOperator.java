//비트 논리 연산과 비트 시프트 연산

public class BitOperator {
	public static void main(String args[]) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		//비트 논리 연산
		System.out.println("[비트 연산 결과]");
		//printf("%04x") -> 값을 4자리의 16진수로 출력하고, 빈 곳에는 0을 삽입한다
		System.out.printf("%04x\n" , (short)(a & b));  //AND 연산
		System.out.printf("%04x\n" , (short)(a | b));  //OR 연산
		System.out.printf("%04x\n" , (short)(a ^ b));  //XOR 연산
		System.out.printf("%04x\n" , (short)(~a));     //NOT 연산
		
		byte c = 20;   //0x14
		byte d = -8;   //0xf8
		
		System.out.println("[시프트 연산 결과]");
		System.out.println(c<<2);   //c를 2비트 왼쪽 시프트
		//c가 양수이므로 최상위 비트에 0 삽입 -> 나누기 4 효과
		System.out.println(c>>2);   //c를 2비트 오른쪽 시프트. 0 삽입
		//d가 음수이므로 최상위 비트에 1 삽입 -> 나누기 4 효과
		System.out.println(d>>2);   //d를 2비트 오른쪽 시프트. 1 삽입
		//시프트 시에 최상위 비트에 0 삽입 -> 나누기 효과 X
		System.out.printf("%x\n", (d >>> 2));
	}
}