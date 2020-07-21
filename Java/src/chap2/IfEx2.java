package chap2;

public class IfEx2 {

	public static void main(String[] args) {
		//switch
		int kor= 90, math=88, eng=70;
		
		char hakjum = ' ';
		
		int total = kor + math + eng ;
		int avg = total/3;
		System.out.println(avg);
		
		switch(avg/10) {
			case 10:
			case 9: 
				hakjum = 'A';
				break;
			case 8: 
				hakjum = 'B';
				break;
			case 7: 
				hakjum = 'C';
				break;	
		}
		System.out.println("당신의 학점은 " + hakjum + "이다");
	}

}
