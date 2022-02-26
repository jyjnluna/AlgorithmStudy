import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Baekjoon5543 {

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int Sangdeok = Integer.parseInt(st.nextToken());
		int Joongdeok = Integer.parseInt(br.readLine());
		int Hadeok = Integer.parseInt(br.readLine());
		int Coke = Integer.parseInt(br.readLine());
		int Cider = Integer.parseInt(br.readLine());
		int BuggerMin = 0;
		int DrinkMin = 0;
		
		if(Sangdeok<=Joongdeok) {
			BuggerMin = Sangdeok;
		}
		else {
			BuggerMin = Joongdeok;
		}
		if(Hadeok<=BuggerMin) {
			BuggerMin = Hadeok;
		}
		
		if(Coke<=Cider) {
			DrinkMin = Coke;
		}
		else {
			DrinkMin = Cider;
		}
			
		System.out.println(BuggerMin+DrinkMin-50);
	}

}
