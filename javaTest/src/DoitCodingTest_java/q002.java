package DoitCodingTest_java;

import java.util.Scanner;

public class q002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double A[] = new double[N];
		
		double sum = 0;
		double max = 0;
		double avg = 0;
		
		
		for(int i=0; i<A.length; i++) {
			A[i] = sc.nextInt();
			
			if(A[i] > max) {
				max = A[i];
			}
			
		}
		for(int i=0; i<A.length; i++) {
			A[i] = A[i]/max*100.0;
			sum += A[i];
		}
		
		
		
		System.out.println(avg = sum/N);
		
		
		
		
		
		

	}

}
