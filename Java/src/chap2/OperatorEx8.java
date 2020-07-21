package chap2;

public class OperatorEx8 {

	public static void main(String[] args) {
		//++, --증감 연산자  +,- (부호연산자)
		int xx = 10, yy=20;
		System.out.println(+xx);
		System.out.println(-xx);
		
		int k =10;
		byte kk = 20;
		
		k++; //k=k+1;
		kk--;//kk = kk-1;
		System.out.println("k="+k);
		System.out.println("k="+kk);
		
		int cc = 10;
		int dd =++cc; //cc값을 증가시키고 다음에 dd에 대입을 한다.
		cc = 10;
		int ee = cc++; //대입을 먼저한 후 cc값을 증가 시킨다.
		System.out.println("cc="+cc);
		System.out.println("dd="+dd);
		System.out.println("ee="+ee);
		
	}


}
