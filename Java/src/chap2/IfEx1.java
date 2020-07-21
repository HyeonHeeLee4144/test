package chap2;

public class IfEx1 {

	public static void main(String[] args) {
		if(true);
		if(true) {
			System.out.println("참이다");
		}
		
		int jumsu = 60;
		//학점을 부여하기 위한 변수 공백으로 초기화
		char hakjum = ' ';
		if(jumsu > 90) {
			hakjum = 'A';
		
		}else if(jumsu >= 80) {
			
			hakjum = 'B';
		} else {
			hakjum = 'c';
		}
		System.out.println("당신의 학점은 " + hakjum + "이다");
		
		//삼항 연산자를 이용해서 위의 다중 if문을 바꿔보자
		hakjum = (jumsu >= 90)? 'A': (jumsu >= 80) ? 'B' : 'C';
		System.out.println("당신의 학점은 " + hakjum + "이다");
	}//End of main

}//클래스의 끝
