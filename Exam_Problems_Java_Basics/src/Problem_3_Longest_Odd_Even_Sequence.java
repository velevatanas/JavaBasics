import java.util.Scanner;


public class Problem_3_Longest_Odd_Even_Sequence {

	public static void main(String[] args) {
		Scanner see = new Scanner(System.in);
		String[] input = see.nextLine().split("[)( ]+");
		int t = 0;
		int ttemp = 0;
		for (int i = 1; i < input.length; i++) {
			if(ttemp > t){
				t = ttemp;
			}
			ttemp = 0;
			int a = Integer.parseInt(input[i]);
			ttemp++;
			for (int j = i + 1; j < input.length; j++) {
				int b = Integer.parseInt(input[j]);				
				if(((a == 0 || b == 0))||((a%2 == 0 || b%2 == 0) && !(a%2 == 0 && b%2 == 0))){
					ttemp++;
					a = b;
				}
				else{
					if(ttemp > t){
						t = ttemp;
					}
					ttemp = 0;
					break;
				}
			}
		}
		System.out.println(t);
	}

}
