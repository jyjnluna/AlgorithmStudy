/*
����
<�׸� 1>�� ���� 9��9 �����ǿ� ������ 81���� �ڿ��� �Ǵ� 0�� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� �� �� ���� ��ġ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

���� ���, ������ ���� 81���� ���� �־�����

 	1��	2��	3��	4��	5��	6��	7��	8��	9��
1��	3	23	85	34	17	74	25	52	65
2��	10	7	39	42	88	52	14	72	63
3��	87	42	18	78	53	45	18	84	53
4��	34	28	64	85	12	16	75	36	55
5��	21	77	45	35	28	75	90	76	1
6��	25	87	65	15	28	11	37	28	74
7��	65	27	75	41	7	89	78	64	39
8��	47	47	70	45	23	65	3	41	44
9��	87	13	82	38	31	12	29	29	80

�̵� �� �ִ��� 90�̰�, �� ���� 5�� 7���� ��ġ�Ѵ�.

�Է�
ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� ��ȩ ���� ���� �־�����. �־����� ���� 100���� ���� �ڿ��� �Ǵ� 0�̴�.

���
ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� ��ġ�� �� ��ȣ�� �� ��ȣ�� ��ĭ�� ���̿� �ΰ� ���ʷ� ����Ѵ�. �ִ��� �� �� �̻��� ��� �� �� �� ���� ��ġ�� ����Ѵ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2566 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [][] arr = new int [9][9];
		int max = 0; int row = 0; int col = 0;
		
		for(int i=0; i<9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] > max) {
					max = arr[i][j]; // �ִ�
					row = i+1; // �迭�� 0���� �����ϹǷ� 1�� �����ش�.
					col = j+1; // �迭�� 0���� �����ϹǷ� 1�� �����ش�.
				}
			}
		}
		
		System.out.println(max);
		System.out.println(row+" "+col);
	}

}
