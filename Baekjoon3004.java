import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon3004 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		
		int sum = 2;
		
		for(int i = 2; i <= A; i++) {
			sum += ((i / 2) +1);
		} 
		System.out.println(sum);
	}

}
