import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
///РЕШЕНО!
public class Problem_4_Orders {

	public static void main(String[] args) {
		Scanner see = new Scanner(System.in);
		int n = see.nextInt();
		see.nextLine();
		Map<String, Map<String, Integer>> map = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			String[] input = see.nextLine().split(" ");
			String names = input[0];
			String fruits = input[2];
			int count = Integer.parseInt(input[1]);
			if(map.get(fruits) == null){
				map.put(fruits,  new TreeMap<>());
				map.get(fruits).put(names, count);
			}
			else if(map.get(fruits).get(names) == null){
				map.get(fruits).put(names, count);
			}
			else{
				int sum = map.get(fruits).get(names);
				sum+= count;
				map.get(fruits).put(names, sum);
			}
		}
		for (String food : map.keySet()) {
			String finals = "";
			finals+= food + ": ";
			for (String name : map.get(food).keySet()) {
				finals+= name + " " + map.get(food).get(name) + ", ";
			}
			finals = finals.substring(0, finals.length()-2);
			System.out.println(finals);
		}		
	}

}
