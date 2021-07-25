public class LogicalOperator {
	public static void main(String[] args) {
		//비교연산과 논리연산의 복합
		
		//And연산 -> 두 값이 true일때만 true -> true와 false -> false반환
		System.out.println((3>2) && (3>4));
		//Or 연산 -> 두 값이 false일때만 false -> true와 false -> true반환
		System.out.println((3!=2) || (-1>0));
		//Xor 연산 -> 두 값이 서로 다를 때 true -> true와 false -> true반환
		System.out.println((3!=2) ^ (-1>0));
	}
}