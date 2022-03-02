/*
����
�Ѽ��� ���� (x, y)�� �ִ�. ���簢���� �� ���� ��ǥ�࿡ �����ϰ�, ���� �Ʒ� �������� (0, 0), ������ �� �������� (w, h)�� �ִ�. ���簢���� ��輱���� ���� �Ÿ��� �ּڰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� x, y, w, h�� �־�����.

���
ù° �ٿ� ������ ������ ����Ѵ�.

����
1 �� w, h �� 1,000
1 �� x �� w-1
1 �� y �� h-1
x, y, w, h�� ����
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon1085 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int x = Integer.parseInt(st.nextToken()); // x��ǥ �Է�
		int y = Integer.parseInt(st.nextToken()); // y��ǥ �Է�
		int w = Integer.parseInt(st.nextToken()); // w��ǥ �Է�
		int h = Integer.parseInt(st.nextToken()); // h��ǥ �Է�
		
		int xmin = Math.min(x, w-x); // x���� �ּҰŸ���
		int ymin = Math.min(y, h-y); // y���� �ּҰŸ���
		
		System.out.println(Math.min(xmin, ymin));
	}

}
