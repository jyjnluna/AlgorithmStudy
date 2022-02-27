import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int h1 = sc.nextInt(), m1 = sc.nextInt(), s1 = sc.nextInt();
			int h2 = sc.nextInt(), m2 = sc.nextInt(), s2 = sc.nextInt();
			
			int t1 = h1*60*60 + m1*60 + s1;
			int t2 = h2*60*60 + m2*60 + s2;
			
			int t = t2 - t1;
			
			int h = (t/60)/60 %24;
			int m = (t/60)%60;
			int s = t%60;
			
			System.out.println(h+" "+m+" "+s);
		}
	}

}

