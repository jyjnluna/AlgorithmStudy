/*
모의고사
문제 설명
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.

1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...

1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한 조건
시험은 최대 10,000 문제로 구성되어있습니다.
문제의 정답은 1, 2, 3, 4, 5중 하나입니다.
가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.

입출력 예
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
			//  배열의 길이만큼 나눠서 패턴을 만듦
			if(answers[i] == a[i%a.length]) arr[0]++;
			if(answers[i] == b[i%b.length]) arr[1]++;
			if(answers[i] == c[i%c.length]) arr[2]++;	
		}
		
        int max = Math.max(Math.max(arr[0], arr[1]), arr[2]); // max값 구하기
        
        ArrayList<Integer> list = new ArrayList<>();
        
        // max값과 같으면 리스트에 추가한다.
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
