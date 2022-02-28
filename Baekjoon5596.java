/*
문제
대한고등학교에 재학 중인 민국이와 만세는 4과목(정보, 수학, 과학, 영어)에 대한 시험을 봤다. 민국이와 만세가 본 4과목의 점수를 입력하면, 민국이의 총점 S와 만세의 총점 T 중에서 큰 점수를 출력하는 프로그램을 작성하시오. 단, 서로 동점일 때는 민국이의 총점 S를 출력한다.

입력
입력은 2줄로 이루어져 있다.

1번째 줄에는 순서대로 민국이의 정보, 수학, 과학, 영어 점수(정수형)가 있으며, 공백으로 구분되어 있다.

2번째 줄에는 1번째 줄과 마찬가지로 순서대로 만세의 정보, 수학, 과학, 영어 점수(정수형)가 있고, 공백으로 구분되어 있다.

출력
문제에서 요구하는 정답을 출력한다.
*/

import java.util.Scanner;


public class Baekjoon5596 {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		
		int minguk = 0;
		int manse = 0;
		
		int score1 = 0;
		int score2 = 0;
		
		for(int i=0; i<4; i++) {
			minguk = sc.nextInt(); // 민국이의 정보,수학,과학,영어 점수 입력
			score1 += minguk; // 민국이의 점수의 총합
		}
		
		for(int i=0; i<4; i++) {
			manse = sc.nextInt(); // 만세의 정보,수학,과학,영어 점수 입력
			score2 += manse; // 만세의 점수의 총합
		}
		
		//민국이의 합계 점수가 높으면 민국이의 합계 점수를 출력하고 만세의 합계 점수가 높으면 만세의 합계 점수를 출력
		if(score1>=score2) {
			System.out.println(score1);
		}
		else {
			System.out.println(score2);
		}
				
		

		
	}

}
