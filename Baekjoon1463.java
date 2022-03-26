/*
문제
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

입력
첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 정수 N이 주어진다.

출력
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다. 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Baekjoon1463 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 3을 나누고 2를 나누는 것처럼 순서가 있는 것이 아니라 최적의 결과를 얻어내야하기 때문에 동적계획법을 사용하여 문제를 푼다.
		int [] arr = new int [N+1];
		arr[0] = 0;
		arr[1] = 0;
		
		for(int i=2; i<=N; i++) {
			arr[i] = arr[i-1]+1; 	// 1을 빼는 경우 일때
			                        // 1을 빼고 시작하는 이유는 다음에 계산할 나누기가 1을 뺀 값보다 작거나 큼에 따라 교체되기 때문이다.
			
			if(i%3==0)
				arr[i] = Math.min(arr[i], arr[i/3]+1); // 3으로 나누어 떨어지면 3으로 나눈 수에서 횟수 + 1
			                                           // 1을 더하는 것은 arr는 결과가 아닌 계산한 횟수를 저장하는것이기 때문이다.
			                                           // arr[i]에는 더하지 않는 이유는 이미 1을 뺄 때 1을 더해줬기 때문이다.
		
			if(i%2==0)
				arr[i] = Math.min(arr[i], arr[i/2]+1); // 2로 나누어 떨어지면 2로 나눈 수에서 횟수 + 1
		}
		
		System.out.println(arr[N]);
	}

}
