package Extra;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DecimalRepresentation {
	
	/*Two non-negative integers N and M are said to be similar if their decimal representations 
	 * can be obtained from each other by rearranging the digits. Note that a correct decimal 
	 * representation does not contain leading zeros JAVA
	 */

	public static int solution(int N) {
		
		if(N<=10){
			return 1;
		}

		String temp = String.valueOf(N);
		int[] digitArray = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
		    digitArray[i] = temp.charAt(i) - '0';
		}
		return digitPermutation(digitArray);
	    }

	    public static int digitPermutation(int[] digitArray) {

			Set<List<Integer>> setOfPermutations = new HashSet<List<Integer>>();
			setOfPermutations.add(new ArrayList<Integer>());
	
			for (int i = 0; i < digitArray.length; i++) {
	
			    List<List<Integer>> current = new ArrayList<List<Integer>>();
			    for (List<Integer> permutation : setOfPermutations) {
	
				int lenght = permutation.size();
				for (int j = 0; j < lenght + 1; j++) {
	
				    ArrayList<Integer> clonePermutation = (ArrayList<Integer>) ((ArrayList<Integer>) permutation).clone();
				    clonePermutation.add(j, digitArray[i]);
				    current.add(new ArrayList<Integer>(clonePermutation));
				}
			    }
			    setOfPermutations = new HashSet<List<Integer>>(current);
			}
			int count=0;
			for(List<Integer> list : setOfPermutations){
				if(list.get(0)!=0){
					count++;
				}
			}
	
			return count;
	    }

	    public static void main(String[] args) {
		System.out.println(solution(100));
	    }

}
