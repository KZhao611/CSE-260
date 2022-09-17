package cse260;
import java.util.*;
import java.io.*;
public class Letters {
	public static void main(String[] args) throws FileNotFoundException {
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		File file = new File("D:\\eclipse-workspace\\default\\test.txt");
		Scanner input = new Scanner(file);
		String line;
		while(input.hasNext()) {
			line = input.next();
			for(char e: line.toCharArray()) {
				if(!Character.isJavaLetter(e))
					continue;
				e = Character.toUpperCase(e);
				if(count.containsKey(e)) {
					count.put(e, count.get(e)+1);
				}
				else
					count.put(e, 1);
			}
		}
		Iterator<Character> key = count.keySet().iterator();
		Iterator<Integer> val = count.values().iterator();
		while(key.hasNext()) {
			System.out.println(key.next() + " appears " + val.next() + " time(s).");
		}
	}
}
