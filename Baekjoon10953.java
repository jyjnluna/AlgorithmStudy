import java.util.Scanner;

public class Baekjoon10953 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i = 0; i < t; i++) {
			String[] str = sc.next().split(",");
			System.out.println(Integer.parseInt(str[0])+Integer.parseInt(str[1]));
		}
	}

}
