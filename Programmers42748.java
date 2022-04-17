/*
문제 설명
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
2에서 나온 배열의 3번째 숫자는 5입니다.
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
array의 길이는 1 이상 100 이하입니다.
array의 각 원소는 1 이상 100 이하입니다.
commands의 길이는 1 이상 50 이하입니다.
commands의 각 원소는 길이가 3입니다.
입출력 예
array					commands							return
[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
 */

import java.util.*;

public class Programmers42748 {
    public int[] solution(int[] array, int[][] commands) {
    	
        int[] answer = new int[commands.length]; // commands의 길이만큼 선택해야하기 때문에 사이즈를 commands의 길이로 설정
            
        for(int i=0; i<commands.length; i++) {
        	int startIndex = commands[i][0]; // 시작 위치
            int endIndex = commands[i][1]; // 마지막 위치
            int selectIndex = commands[i][2]; // 선택 위치
            
            // copyOfRange(배열, 시작 인덱스, 끝 인덱스) : 배열을 복사해주는 함수, 원본 배열을 먼저 넣고 복사를 시작할 인덱스와 마지막 인덱스를 받는다. 시작 인덱스는 포함하지만 끝 인덱스는 제외.
            int[] splitArray = Arrays.copyOfRange(array, startIndex-1, endIndex); // 배열이 0번부터 시작하기 때문에 1을 빼줌
            
            Arrays.sort(splitArray);
            
            answer[i] = splitArray[selectIndex-1];
        }
        
        return answer;
    }
}
