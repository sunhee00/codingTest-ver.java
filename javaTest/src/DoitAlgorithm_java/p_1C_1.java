package DoitAlgorithm_java;

import java.util.Scanner;

public class p_1C_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다.");
		
		System.out.print("a의 값: ");
		int a = sc.nextInt();
		System.out.print("b의 값: ");
		int b = sc.nextInt();
		System.out.print("c의 값: ");
		int c = sc.nextInt();
		
		int meddle = med(a,b,c);
		
		System.out.println("중앙값은 " + meddle + "입니다.");
		
		

	}
	
	static int med(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(c >= a) {
				return a;
			}else {
				return c;
			}
		}else if(a > c) {
			return a;
		}else if(b > c){
			return c;
		}else {//c>a
			return b;
		}
		
		
	}

}
