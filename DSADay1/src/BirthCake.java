import java.util.ArrayList;
import java.util.List;

public class BirthCake {
	public static void main(String[] args) {
		ArrayList<Integer> Candles = new ArrayList<Integer>();
		Candles.add(1);
		Candles.add(2);
		Candles.add(3);
		Candles.add(4);
		Candles.add(4);
		
		System.out.println(BirthdayCakeCandles(Candles));
	}
	public static int BirthdayCakeCandles(List<Integer> Candles) {
		int max = Candles.get(0);
		int count=0;
		for (int i=0; i< Candles.size(); i++) {
			if(Candles.get(i)> max) {
				max=Candles.get(i);
				count=0;
			} else{
				count++;
			}
		}
		return max;
	}
}