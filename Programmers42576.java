/*
문제 설명
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

제한사항
마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
completion의 길이는 participant의 길이보다 1 작습니다.
참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
참가자 중에는 동명이인이 있을 수 있습니다.

입출력 예
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

입출력 예 설명
예제 #1
"leo"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #2
"vinko"는 참여자 명단에는 있지만, 완주자 명단에는 없기 때문에 완주하지 못했습니다.

예제 #3
"mislav"는 참여자 명단에는 두 명이 있지만, 완주자 명단에는 한 명밖에 없기 때문에 한명은 완주하지 못했습니다.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programmers42576 {
    public String solution(String[] participant, String[] completion) {
       String answer = "";
       HashMap<String, Integer> map = new HashMap<>();
       // HashMap.put(Key,Value) : Hash Map에 Key와 Value를 한 쌍으로 입력하는 함수
       for (String player : participant)
    	   map.put(player, map.getOrDefault(player, 0) + 1); // HashMap.getOrDefault('B',0) 이 함수는 'B'라는 Key에 해당하는 Value가 있으면 가져오고, 아닐 경우 0을 Default로 지정하여 사용하겠다는 의미의 함수
       for(String player : completion)
    	   map.put(player, map.get(player) - 1);
       
       	Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); // 요소들을 순차적으로 처리하기 위해 iterator 반복자 사용
       
       	while(iter.hasNext()) {
       		Map.Entry<String, Integer> entry = iter.next();
       		if(entry.getValue() != 0) {
       			answer = entry.getKey(); //HashMap.get(Key) : Key에 해당하는 Value를 반환하는 함수
       			break;
       		}
       	}
       	return answer;
    }
    
    public static void main(String[] args) {
    	String[] part = {"leo", "kiki", "eden"};
    	String[] comp = {"eden", "kiki"};
    	Programmers42576 sol = new Programmers42576();
    	System.out.println(sol.solution(part, comp));
    }
}

/*
HashMap 만들어서 풀기
HashMap이란 Key-Value의 Pair를 관리하는 클래스
HashMap<String, Integer>로 지정하면 Key는 String형태, Value는 Integer 형태로 정의하는 것
이 문제에서 Key는 Participant의 이름, Value는 Count 되기 때문에 String/Integer로 해야함
*/
