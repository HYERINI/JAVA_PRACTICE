public class TypeConversion {
	public static void main(String[] args) {
		byte b = 127;
		int i = 100;
		System.out.println(b+i);
		System.out.println(10/4);  //b가 int타입으로 자동변환
		System.out.println(10.0/4); //4가 4.0으로 자동변환
		System.out.println((char)0x12340041); //문자 'A'
		//b+i는 227, 16진수 0xE3, 즉 -29
		System.out.println((byte)(b+i)); //bite타입으로 강제형변환
		System.out.println((int)2.9 + 1.8); //2.9만 int타입으로 강제형변환
		System.out.println((int)(2.9 + 1.8)); //더한 값을 int타입으로 강제형변환
		System.out.println((int)2.9 + (int)1.8); //각자 int타입으로 변환 후 덧셈
	}
}