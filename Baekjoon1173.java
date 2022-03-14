/*
����
�����̰� ��� �ϴ� ������ 1�� ������ �������� �ִ�. �� �и��� �����̴� ��� �޽� �� �ϳ��� �����ؾ� �Ѵ�.

��� ������ ���, �������� �ƹ��� T��ŭ �����Ѵ�. ��, �������� �ƹ��� X���ٸ�, 1�� ���� ��� �� �� �ƹ��� X+T�� �Ǵ� ���̴�. �����̴� �ƹ��� M�� �Ѵ� ���� ������ �ʱ� ������, X+T�� M���� �۰ų� ���� ���� ��� �� �� �ִ�. �޽��� �����ϴ� ��� �ƹ��� R��ŭ �����Ѵ�. ��, �������� �ƹ��� X���ٸ�, 1�� ���� �޽��� �� �� �ƹ��� X-R�� �ȴ�. �ƹ��� ����� m���� �������� �ȵȴ�. ����, X-R�� m���� ������ �ƹ��� m�� �ȴ�.

�������� �ʱ� �ƹ��� m�̴�. ��� N�� �Ϸ��� �Ѵ�. �̶� ��� N���ϴµ� �ʿ��� �ð��� �ּڰ��� ���غ���. ��ϴ� �ð��� ���ӵ��� �ʾƵ� �ȴ�.

�Է�
ù° �ٿ� �ټ� ���� N, m, M, T, R�� �־�����.

���
ù° �ٿ� ��� N���ϴµ� �ʿ��� �ð��� �ּڰ��� ����Ѵ�.. ���� ��� N�� �� �� ���ٸ� -1�� ����Ѵ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1173 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		int N = Integer.parseInt(st.nextToken()); // � �ð� �Է�
		int m = Integer.parseInt(st.nextToken()); // �ʱ� �ƹ� �Է�
		int M = Integer.parseInt(st.nextToken()); // �ƹ� �ִ밪 �Է�
		int T = Integer.parseInt(st.nextToken()); // �ƹ� ������ �Է�
		int R = Integer.parseInt(st.nextToken()); // �ƹ� ���ҷ� �Է�
		
		int minPulse = m; // �ּ� �ƹ�
		int sum = 0; // �ݺ� �� ����
		
		if((M-m) < T)
			System.out.println(-1); // ��� �ѹ��� �� �� ��� -1 ���
		else {
			// ���ѷ���
			for(;;) {
				if((m + T) <= M) {
					m += T;
					N--;	
				}
				else
					m -= R;
				
				// �������� ���� �ּ� �ƹں��� ������ �ּ� �ƹ� ����
				if(m < minPulse)
					m = minPulse;
				
				sum++;	
				
				// ��� �� �ϸ� ���ѷ��� ����
				if(N == 0)
					break;
			}
			System.out.println(sum);					
		}	
		
	}

}
