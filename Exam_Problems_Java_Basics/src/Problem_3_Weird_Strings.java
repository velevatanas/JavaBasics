import java.util.Scanner;
//РЕШЕНА!
public class Problem_3_Weird_Strings {

	public static void main(String[] args) {
		Scanner see = new Scanner(System.in);
		String[] input = see.nextLine().split("[)(|/\\\\ ]+");		
		String f = String.join("", input);		
		String[] words = f.split("[\\W\\d_]+");
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] sums = new int[words.length];
		for (int i = 0; i < words.length; i++) {
			int sum = 0;
			for (int j = 0; j < words[i].length(); j++) {
				if((int)words[i].charAt(j) >= 97){
					for (int j2 = 0; j2 < alphabet.length(); j2++) {
						if(words[i].charAt(j) == alphabet.charAt(j2)){
							sum+= (j2 + 1);
							break;
						}
					}
				}
				else if((int)words[i].charAt(j) < 97){
					for (int j2 = 0; j2 < Alphabet.length(); j2++) {
						if(words[i].charAt(j) == Alphabet.charAt(j2)){
							sum+= (j2 + 1);
							break;
						}
					}
				}
			}
			sums[i] = sum;
		}
		int biggestsum = sums[0]+sums[1];
		String big1 = "" + words[0];
		String big2 = "" + words[1];
		for (int i = 1; i <= sums.length-2; i++) {
			if(biggestsum <= sums[i]+sums[i+1]){
				 big1 = "" + words[i];
				 big2 = "" + words[i+1];
				 biggestsum = sums[i]+sums[i+1];
			}
		}
		System.out.println(big1);
		System.out.println(big2);
		
	}

}
