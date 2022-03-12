import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2576 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		// 7���� �ڿ��� �Է�
		for(int i=0; i<7; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			// Ȧ���� ��� ���� ���ϰ� Ȧ�� �� �ּҰ��� �����Ѵ�.
			if(N % 2 != 0) {
				sum += N;
				if(min >= N)
					min = N;
			}
		}
		// Ȧ���� �������� ���� ��� -1 ���
		if(sum == 0)
			System.out.println(-1);	 
		// Ȧ���� �����ϴ� ��� ù°�ٿ� ���� ���, ��°�ٿ��� �ּڰ� ���
		else {
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
	
}
