import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinGap {
	public static void main (String[] args) {
		int[] array = {1,12,5,3,4,12,1};
		System.out.println(Arrays.toString(array));
		System.out.println(findMinGap(array));
		
	}
	public static int findMinGap (int[] array) {
		List<Integer> array1 = new ArrayList<Integer>();
		int min= array.length;
		for (int i=0; i< array.length; i++) {
			if(array1.contains(i)) {
				int k = i- array1.lastIndexOf(i);
				min = Math.min(array.length, k);
			}
			array1.add(array[i]);
		}
		return min;
	}
}
