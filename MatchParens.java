package cse260;
import java.io.File;
import java.util.*;
public class MatchParens {
	public static void main(String[] args) {
		File file = new File(args[0]);
		Scanner input = new Scanner(file);
		Stack<Character> paren = new Stack<Character>();
		String line;
		while(input.hasNext()) {
			line = input.next();
			for(char e: line.toCharArray()) {	
				System.out.print(e);
				switch (e){
				case '{':
				case '[':
				case '(':
					paren.push(e);
					break;
				case '}':
					if(paren.peek() != '{') {
						System.out.println("Incorrect");
						System.out.println(paren);
						return;
					}	
					paren.pop();
					break;
				case ']':
					if(paren.peek() != '[') {
						System.out.println("Incorrect");
						System.out.println(paren);
						return;
					}
					paren.pop();
					break;
				case ')':
					if(paren.peek() != '(') {
						System.out.println("Incorrect");
						System.out.println(paren);
						return;
					}
					paren.pop();
					break;
				}
			}
		}
		if(paren.isEmpty())
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
		
	}
}
