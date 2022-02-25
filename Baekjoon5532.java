import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon5532 {

	public static double bigger(double a, double b) {
		if(a > b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int L = Integer.parseInt(st.nextToken());
		Double A = Double.parseDouble(br.readLine());
		Double B = Double.parseDouble(br.readLine());
		Double C = Double.parseDouble(br.readLine());
		Double D = Double.parseDouble(br.readLine());
		
		int X = (int)Math.ceil(bigger(A/C, B/D));
		
		System.out.println(L-X);
		
	}

}
