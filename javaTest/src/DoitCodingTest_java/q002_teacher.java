package DoitCodingTest_java;

import java.util.Scanner;

public class q002_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int A[] = new int[N];

		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		
		long sum = 0;
		long max = 0;
		
		for(int i=0; i<N; i++) {
			sum+=A[i];
			if(A[i] > max) {
				max = A[i];
			}
		}
		
		//소수점을 붙이면 double로 자동변환되어서 출력
		System.out.println(sum * 100.0 / max / N);
	}

}
