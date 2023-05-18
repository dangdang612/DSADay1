import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OddTime {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4,15,14,15 };
		Map<Integer, Integer> listExport= findOddTimeNum(array);
		System.out.println(listExport.toString());
	}

	public static Map<Integer, Integer> findOddTimeNum(int[] arr) {
		Map <Integer, Integer> OddTime = new HashMap <Integer, Integer>();
		for (int i=0; i < arr.length; i++) {
			int key = arr[i];
			if(OddTime.containsKey(key)) {
				int frequence = OddTime.get(key);
				++frequence;
				OddTime.put(key, frequence);
			}
			else OddTime.put(key, 1);
		}
		List<Integer> OddTime1 = new ArrayList<Integer>();
		for(int key:OddTime.keySet()) {
			if(OddTime.get(key)%2 !=0) {
				OddTime1.add(key);
			}
		}
		return OddTime;
}
}

	
	
	

