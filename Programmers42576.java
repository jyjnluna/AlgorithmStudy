/*
���� ����
������ ������ �������� �����濡 �����Ͽ����ϴ�. �� �� ���� ������ �����ϰ�� ��� ������ �������� �����Ͽ����ϴ�.
�����濡 ������ �������� �̸��� ��� �迭 participant�� ������ �������� �̸��� ��� �迭 completion�� �־��� ��, �������� ���� ������ �̸��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

���ѻ���
������ ��⿡ ������ ������ ���� 1�� �̻� 100,000�� �����Դϴ�.
completion�� ���̴� participant�� ���̺��� 1 �۽��ϴ�.
�������� �̸��� 1�� �̻� 20�� ������ ���ĺ� �ҹ��ڷ� �̷���� �ֽ��ϴ�.
������ �߿��� ���������� ���� �� �ֽ��ϴ�.

����� ��
participant	completion	return
["leo", "kiki", "eden"]	["eden", "kiki"]	"leo"
["marina", "josipa", "nikola", "vinko", "filipa"]	["josipa", "filipa", "marina", "nikola"]	"vinko"
["mislav", "stanko", "mislav", "ana"]	["stanko", "ana", "mislav"]	"mislav"

����� �� ����
���� #1
"leo"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #2
"vinko"�� ������ ��ܿ��� ������, ������ ��ܿ��� ���� ������ �������� ���߽��ϴ�.

���� #3
"mislav"�� ������ ��ܿ��� �� ���� ������, ������ ��ܿ��� �� ��ۿ� ���� ������ �Ѹ��� �������� ���߽��ϴ�.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Programmers42576 {
    public String solution(String[] participant, String[] completion) {
       String answer = "";
       HashMap<String, Integer> map = new HashMap<>();
       // HashMap.put(Key,Value) : Hash Map�� Key�� Value�� �� ������ �Է��ϴ� �Լ�
       for (String player : participant)
    	   map.put(player, map.getOrDefault(player, 0) + 1); // HashMap.getOrDefault('B',0) �� �Լ��� 'B'��� Key�� �ش��ϴ� Value�� ������ ��������, �ƴ� ��� 0�� Default�� �����Ͽ� ����ϰڴٴ� �ǹ��� �Լ�
       for(String player : completion)
    	   map.put(player, map.get(player) - 1);
       
       	Iterator<Map.Entry<String, Integer>> iter = map.entrySet().iterator(); // ��ҵ��� ���������� ó���ϱ� ���� iterator �ݺ��� ���
       
       	while(iter.hasNext()) {
       		Map.Entry<String, Integer> entry = iter.next();
       		if(entry.getValue() != 0) {
       			answer = entry.getKey(); //HashMap.get(Key) : Key�� �ش��ϴ� Value�� ��ȯ�ϴ� �Լ�
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
HashMap ���� Ǯ��
HashMap�̶� Key-Value�� Pair�� �����ϴ� Ŭ����
HashMap<String, Integer>�� �����ϸ� Key�� String����, Value�� Integer ���·� �����ϴ� ��
�� �������� Key�� Participant�� �̸�, Value�� Count �Ǳ� ������ String/Integer�� �ؾ���
*/
