/*
문제
N개의 정수가 주어지면, 이 정수들의 합 S의 부호를 구하는 프로그램을 작성하시오.

입력
총 3개의 테스트 셋이 주어진다. 각 테스트 셋의 첫째 줄에는 N(1 ≤ N ≤ 100,000)이 주어지고, 둘째 줄부터 N개의 줄에 걸쳐 각 정수가 주어진다. 주어지는 정수의 절댓값은 9223372036854775807보다 작거나 같다.

출력
총 3개의 줄에 걸쳐 각 테스트 셋에 대해 N개의 정수들의 합 S의 부호를 출력한다. S=0이면 "0"을, S>0이면 "+"를, S<0이면 "-"를 출력하면 된다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon1247 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			BigInteger B = new BigInteger("0"); // 9223372036854775807이 100,000번 들어오면 long형보다 커지기 때문에 BigInteger를 사용한다.
			int N1 = Integer.parseInt(br.readLine());
			
			for(int j=0; j<N1; j++) {
				BigInteger N2 = new BigInteger(br.readLine());
				B = B.add(N2);
			}
			
			if(B.compareTo(BigInteger.ZERO) == 0) {
				System.out.println("0");
			}
			else if(B.compareTo(BigInteger.ZERO) > 0) {
				System.out.println("+");
			}
			else {
				System.out.println("-");
			}
		}
	}

}
