package chap2;

public class OperatorEx9 {

	public static void main(String[] args) {
		//비트별 not 연산자: ~
		int gg = 0xfffffff3;
		System.out.println("~gg=" + ~gg);
		
		//논리부정 연산자 : !
		boolean bool = true;
		System.out.println(!bool);
		System.out.println(!(100>200));
		
	}

}
