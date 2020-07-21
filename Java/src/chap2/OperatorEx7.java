package chap2;

public class OperatorEx7 {

	public static void main(String[] args) {
		int ii = 10;
		ii+= 10; //ii= ii+10
		
		int jj = 10;
		jj-=3;//jj= jj-3
		
		
		int x = 5;
		x <<=2; //x=x<<2;
		
		int y =3;
		y^=2; //y=y^2; XOR연산 서로다른 비트인경우 값이1
		
		System.out.println("ii=" + ii);
		System.out.println("jj=" + jj);
		System.out.println("x=" + x); 
		System.out.println("y=" + y); 
		
		
	}

}
