import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class dfghjk {
	public static void main (String[] args){
		String[] array = new String[]{"Level", "History", "Match", "Level", "History"};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
		Set<String> set = new LinkedHashSet<>(list);
		for (String string : set) {
			System.out.println(string);
		}
	}
}
