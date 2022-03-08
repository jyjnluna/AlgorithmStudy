/*
����
�������� �� ���� �Ʒ� �׸��� ���� ���� ��� ������. N�ܰ迡�� ���� ������ ��� �� ���ϱ�?

1�ܰ� 5��, 2�ܰ� 12��, 3�ܰ� 22�� ... (�׸��� �������� ���� �۷� ����)

�Է�
ù° �ٿ� N(1 �� N �� 10,000,000)�� �־�����.

���
ù° �ٿ� N�ܰ迡�� ���� ������ 45678�� ���� �������� ����Ѵ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1964 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int dot = 45678;
		int result = 5;
		
		for(int i=1; i<N; i++) {
			result = (result + (i+2) * 3 - 2) % dot; // 1�ܰ迡�� �ܰ谡 �ö󰡸鼭 �߰��� ����� ���� ���� �� 45678�� ���� ��������
		}
		
		System.out.println(result);	
	}

}
