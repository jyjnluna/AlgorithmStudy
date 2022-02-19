import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Baekjoon2530 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		LocalTime localTime = LocalTime.of(
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()),
				Integer.parseInt(st.nextToken()));
		
		localTime = localTime.plusSeconds(Integer.parseInt(br.readLine()));
		
		System.out.println(localTime.getHour() + " "+ localTime.getMinute() + " " + localTime.getSecond());
	}

}
