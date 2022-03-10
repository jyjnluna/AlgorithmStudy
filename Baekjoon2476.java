/*
����
1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�.

1.���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
2.���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
3.��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. �� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� �� �� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.

N(2 �� N �� 1,000)���� �ֻ��� ���ӿ� �����Ͽ��� ��, ���� ���� ����� ���� ����� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ��� �����ϴ� ��� �� N�� �־����� �� ���� �ٺ��� N���� �ٿ� ������� �ֻ����� ���� 3���� ���� ��ĭ�� ���̿� �ΰ� ���� �־�����. 

���
ù° �ٿ� ���� ���� ����� ���� ����� ����� ����Ѵ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2476 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int maxReword = 0;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			int third = Integer.parseInt(st.nextToken());
			
			// �������� ��Ģ
			if(first == second && second == third)
				sum = 10000 + (first*1000);
			else if(first == second || first == third)
				sum = 1000 + (first*100);
			else if(second == third)
				sum = 1000 + (second*100);
			else {
				int max = Math.max(first,Math.max(second, third));
				sum = max * 100;
			}
			
			// ���� ���� ����� ���� ����� ����� ���
			if(maxReword < sum)
				maxReword = sum;
			
			else if(maxReword > sum)
				maxReword = maxReword;
		}
		
		System.out.println(maxReword); // ���� ���� ����� ���� ����� ����� ���
	}

}
