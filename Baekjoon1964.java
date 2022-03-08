/*
문제
오각형의 각 변에 아래 그림과 같이 점을 찍어 나간다. N단계에서 점의 개수는 모두 몇 개일까?

1단계 5개, 2단계 12개, 3단계 22개 ... (그림을 복사하지 못해 글로 적음)

입력
첫째 줄에 N(1 ≤ N ≤ 10,000,000)이 주어진다.

출력
첫째 줄에 N단계에서 점의 개수를 45678로 나눈 나머지를 출력한다.
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
			result = (result + (i+2) * 3 - 2) % dot; // 1단계에서 단계가 올라가면서 추가로 생기는 점을 더한 후 45678로 나눈 나머지값
		}
		
		System.out.println(result);	
	}

}
