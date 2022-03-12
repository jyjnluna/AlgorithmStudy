import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2576 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		// 7개의 자연수 입력
		for(int i=0; i<7; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			// 홀수일 경우 서로 합하고 홀수 중 최소값을 저장한다.
			if(N % 2 != 0) {
				sum += N;
				if(min >= N)
					min = N;
			}
		}
		// 홀수가 존재하지 않을 경우 -1 출력
		if(sum == 0)
			System.out.println(-1);	 
		// 홀수가 존재하는 경우 첫째줄에 합을 출력, 둘째줄에는 최솟값 출력
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	
}
