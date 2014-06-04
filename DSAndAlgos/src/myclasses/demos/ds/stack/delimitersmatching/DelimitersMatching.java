package myclasses.demos.ds.stack.delimitersmatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DelimitersMatching {
private Stack stack;
	public DelimitersMatching(int size){
		 stack = new Stack(size);
	}
	public static void main(String[] args) throws IOException {
		
		String inputString = getString();
		DelimitersMatching delimiter = new DelimitersMatching(inputString.length());
		delimiter.delimitermatch(inputString);
		
		
	}
	
	private void delimitermatch(String inputString) {
		
		for(int i=0;i<inputString.length();i++){
			char c = inputString.charAt(i);
			switch(c){
			case '{': 
			case '(': 
			case '[': 
				stack.push(c);
				break;
			case '}': 
			case ')': 
			case ']':
				char popChar = stack.pop();
				if(popChar=='{'&&c=='}'||popChar=='('&&c==')'||popChar=='['&&c==']'){
					;
				}else {
						System.out.println("Missmatch in the expression");
					}
				break;
			}
		}
		
		
	}

	public static String getString() throws IOException{
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader b = new BufferedReader(in);
		String s = b.readLine();
		return s;
	}
	
}
