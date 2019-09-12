package dataStructure;
import java.util.*;
public class MaxFrequecy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<>();
		String str;
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		int i,j;
		char c;
		for(i=0;i<str.length();i++) {
			c=str.charAt(i);
			if(map.containsKey(c)) {
				j=map.get(c);
				map.put(c,j++);
			}
			else
				map.put(c, 1);
		}
		char maxchar='\0';
		int max=0;
		Set<Map.Entry<Character, Integer>> entry=map.entrySet();
		for(Map.Entry<Character, Integer> in:entry) {
			if(in.getValue()>max) {
				max=in.getValue();
				maxchar=in.getKey();
			}
		}
		System.out.println("The maximum character is "+ maxchar);
	}

}
