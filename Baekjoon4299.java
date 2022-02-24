import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.StringTokenizer;

public class Baekjoon4299 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		if(A<B) {
			System.out.println("-1");
		}
		else {
			int X = ((A+B)/2), Y = ((A-B)/2);
			
			if(X+Y==A && X-Y==B) {
				System.out.println(X+" "+Y);
			}
			else {
				System.out.println("-1");
			}
		}
	}

}
