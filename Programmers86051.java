/*
���� ����
0���� 9������ ���� �� �Ϻΰ� ����ִ� ���� �迭 numbers�� �Ű������� �־����ϴ�. numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ��� ã�� ���� ���� return �ϵ��� solution �Լ��� �ϼ����ּ���.

���ѻ���
1 �� numbers�� ���� �� 9
0 �� numbers�� ��� ���� �� 9
numbers�� ��� ���Ҵ� ���� �ٸ��ϴ�.
����� ��
numbers	result
[1,2,3,4,6,7,8,0]	14
[5,8,4,0,6,7,9]	6
����� �� ����

����� �� #1
5, 9�� numbers�� �����Ƿ�, 5 + 9 = 14�� return �ؾ� �մϴ�.

����� �� #2
1, 2, 3�� numbers�� �����Ƿ�, 1 + 2 + 3 = 6�� return �ؾ� �մϴ�.
 */
import java.util.Scanner;

public class Programmers86051 {

	    public int solution(int[] numbers) {

	        int sum = 45;
	        
	        for(int i=0; i<numbers.length; i++)
	            sum -= numbers[i]; 
// numbers���� ã�� �� ���� 0���� 9������ ���ڸ� ���� �� = numbers�� ���� ������ �� = 0���� 9������ ��(45) - number�� �ִ� ������ ��
	        
	        return sum;
	    }	
	
	public static void main(String[] args) {

		int numbers[] = {1,2,3,4,6,7,8,0};
    	Programmers86051 sol = new Programmers86051();
    	System.out.println(sol.solution(numbers));
	}

}
