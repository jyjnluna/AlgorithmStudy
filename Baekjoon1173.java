/*
문제
영식이가 운동을 하는 과정은 1분 단위로 나누어져 있다. 매 분마다 영식이는 운동과 휴식 중 하나를 선택해야 한다.

운동을 선택한 경우, 영식이의 맥박이 T만큼 증가한다. 즉, 영식이의 맥박이 X였다면, 1분 동안 운동을 한 후 맥박이 X+T가 되는 것이다. 영식이는 맥박이 M을 넘는 것을 원하지 않기 때문에, X+T가 M보다 작거나 같을 때만 운동을 할 수 있다. 휴식을 선택하는 경우 맥박이 R만큼 감소한다. 즉, 영식이의 맥박이 X였다면, 1분 동안 휴식을 한 후 맥박은 X-R이 된다. 맥박은 절대로 m보다 낮아지면 안된다. 따라서, X-R이 m보다 작으면 맥박은 m이 된다.

영식이의 초기 맥박은 m이다. 운동을 N분 하려고 한다. 이때 운동을 N분하는데 필요한 시간의 최솟값을 구해보자. 운동하는 시간은 연속되지 않아도 된다.

입력
첫째 줄에 다섯 정수 N, m, M, T, R이 주어진다.

출력
첫째 줄에 운동을 N분하는데 필요한 시간의 최솟값을 출력한다.. 만약 운동을 N분 할 수 없다면 -1을 출력한다.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1173 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int N = Integer.parseInt(st.nextToken()); // 운동 시간 입력
		int m = Integer.parseInt(st.nextToken()); // 초기 맥박 입력
		int M = Integer.parseInt(st.nextToken()); // 맥박 최대값 입력
		int T = Integer.parseInt(st.nextToken()); // 맥박 증가량 입력
		int R = Integer.parseInt(st.nextToken()); // 맥박 감소량 입력
		
		int minPulse = m; // 최소 맥박
		int sum = 0; // 반복 값 저장
		
		if((M-m) < T)
			System.out.println(-1); // 운동을 한번도 안 할 경우 -1 출력
		else {
			// 무한루프
			for(;;) {
				if((m + T) <= M) {
					m += T;
					N--;	
				}
				else
					m -= R;
				
				// 쉬었을때 값이 최소 맥박보다 낮으면 최소 맥박 저장
				if(m < minPulse)
					m = minPulse;
				
				sum++;	
				
				// 운동을 다 하면 무한루프 종료
				if(N == 0)
					break;
			}
			System.out.println(sum);					
		}	
		
	}

}
