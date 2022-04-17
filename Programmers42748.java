/*
���� ����
�迭 array�� i��° ���ں��� j��° ���ڱ��� �ڸ��� �������� ��, k��°�� �ִ� ���� ���Ϸ� �մϴ�.

���� ��� array�� [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3�̶��

array�� 2��°���� 5��°���� �ڸ��� [5, 2, 6, 3]�Դϴ�.
1���� ���� �迭�� �����ϸ� [2, 3, 5, 6]�Դϴ�.
2���� ���� �迭�� 3��° ���ڴ� 5�Դϴ�.
�迭 array, [i, j, k]�� ���ҷ� ���� 2���� �迭 commands�� �Ű������� �־��� ��, commands�� ��� ���ҿ� ���� �ռ� ������ ������ �������� �� ���� ����� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
array�� ���̴� 1 �̻� 100 �����Դϴ�.
array�� �� ���Ҵ� 1 �̻� 100 �����Դϴ�.
commands�� ���̴� 1 �̻� 50 �����Դϴ�.
commands�� �� ���Ҵ� ���̰� 3�Դϴ�.
����� ��
array					commands							return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 */

import java.util.*;

public class Programmers42748 {
    public int[] solution(int[] array, int[][] commands) {
    	
        int[] answer = new int[commands.length]; // commands�� ���̸�ŭ �����ؾ��ϱ� ������ ����� commands�� ���̷� ����
            
        for(int i=0; i<commands.length; i++) {
        	int startIndex = commands[i][0]; // ���� ��ġ
            int endIndex = commands[i][1]; // ������ ��ġ
            int selectIndex = commands[i][2]; // ���� ��ġ
            
            // copyOfRange(�迭, ���� �ε���, �� �ε���) : �迭�� �������ִ� �Լ�, ���� �迭�� ���� �ְ� ���縦 ������ �ε����� ������ �ε����� �޴´�. ���� �ε����� ���������� �� �ε����� ����.
            int[] splitArray = Arrays.copyOfRange(array, startIndex-1, endIndex); // �迭�� 0������ �����ϱ� ������ 1�� ����
            
            Arrays.sort(splitArray);
            
            answer[i] = splitArray[selectIndex-1];
        }
        
        return answer;
    }
}
