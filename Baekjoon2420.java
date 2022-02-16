
// 백준 알고리즘 2420번 문제풀이
import java.util.Scanner;

public class Main {
    public static void BaekJoon2420(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long N = sc.nextLong();
        Long M = sc.nextLong();

        sc.close();

        System.out.println(Math.abs(N - M));
    }
}