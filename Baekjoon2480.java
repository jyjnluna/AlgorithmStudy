import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2480 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        int max = A;
        
        if (A == B && B == C) {
            System.out.println(10000 + (1000 * A));
            
        } else if (A != B && B != C && A != C) {
            
            if (max < B) {
                max = B;
            }
            if (max < C) {
                max = C;
            }
            System.out.println(100 * max);
            
        } else {
            
            if (A != B) {
                System.out.println(1000 + (100 * C));
            } else if (A != C) {
                System.out.println(1000 + (100 * B));
            }

        }
    }

}