/*
���ǰ��
���� ����
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.

1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���� ����
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

����� ��
answers		return
[1,2,3,4,5]	[1]
[1,3,2,4,2]	[1,2,3]
 */
import java.util.ArrayList;

public class Programmers42840 {
	public int[] solution(int[] answers) {
		
		int[] a = new int[] {1,2,3,4,5};
		int[] b = new int[] {2,1,2,3,2,4,2,5};
		int[] c = new int[] {3,3,1,1,2,2,4,4,5,5};
		
		int[] arr = new int[3];
		
		for(int i=0; i<answers.length; i++) {
			//  �迭�� ���̸�ŭ ������ ������ ����
			if(answers[i] == a[i%a.length]) arr[0]++;
			if(answers[i] == b[i%b.length]) arr[1]++;
			if(answers[i] == c[i%c.length]) arr[2]++;	
		}
		
        int max = Math.max(Math.max(arr[0], arr[1]), arr[2]); // max�� ���ϱ�
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // max���� ������ ����Ʈ�� �߰��Ѵ�.
        if(max == arr[0])
			list.add(1);
		if(max == arr[1])
			list.add(2);
		if(max == arr[2])
			list.add(3);
        
		int[] answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++)
			answer[i] = list.get(i);        
        
        return answer;
	}

}
