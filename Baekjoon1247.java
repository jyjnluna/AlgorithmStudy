/*
����
N���� ������ �־�����, �� �������� �� S�� ��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
�� 3���� �׽�Ʈ ���� �־�����. �� �׽�Ʈ ���� ù° �ٿ��� N(1 �� N �� 100,000)�� �־�����, ��° �ٺ��� N���� �ٿ� ���� �� ������ �־�����. �־����� ������ ������ 9223372036854775807���� �۰ų� ����.

���
�� 3���� �ٿ� ���� �� �׽�Ʈ �¿� ���� N���� �������� �� S�� ��ȣ�� ����Ѵ�. S=0�̸� "0"��, S>0�̸� "+"��, S<0�̸� "-"�� ����ϸ� �ȴ�.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Baekjoon1247 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<3; i++) {
			BigInteger B = new BigInteger("0"); // 9223372036854775807�� 100,000�� ������ long������ Ŀ���� ������ BigInteger�� ����Ѵ�.
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
