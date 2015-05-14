import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//Решена!!!

public class Problem_3_Valid_Username {
    public static void main(String[] args){
    	Scanner see = new Scanner(System.in);
    	String[] input0 = see.nextLine().split("[/\\\\() ]+");
    	Pattern pattern = Pattern.compile("\\b[a-zA-Z][\\w]{2,24}\\b");
    	ArrayList<String> input = new ArrayList<>();
    	for (int i = 0; i < input0.length; i++) {
    		Matcher matcher = pattern.matcher(input0[i]);
			if(matcher.find() == true){
				input.add(input0[i]);
			}
		}
    	int maxlengths = 0;
    	String[] longusers = new String[2];
    	for (int i = 0; i < input.size()-1; i++) {
			int templengths = (input.get(i).length()) + (input.get(i+1).length());
			if(templengths > maxlengths){
				maxlengths = templengths;
				longusers[0] = input.get(i);
				longusers[1] = input.get(i+1);
			}
		}
    	System.out.println(longusers[0]);
    	System.out.println(longusers[1]);
    }
}
