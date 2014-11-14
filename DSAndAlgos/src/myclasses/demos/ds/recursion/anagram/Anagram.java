package myclasses.demos.ds.recursion.anagram;

import java.util.HashSet;
import java.util.Set;

public class Anagram {
	static int size;
	static int count;
	static char[] arrChar = new char[100];
	static int i;
//static Set<String> sb = new HashSet<String>();
static Set set = new HashSet();
	public static void doAnagram(int newSize) {
		System.out.println("newSize: "+ newSize+ " i "+ i++ );
		if (newSize == 1)
			return;
		for (int j = 0; j < newSize; j++) {
			doAnagram(newSize - 1);
			/*if (newSize == 2)
				displayWord();
			rotate(newSize);*/
		}
	}

	public static void rotate(int newSize) {
		int j;
		int position = size - newSize;
		char temp = arrChar[position];
		for (j = position + 1; j < size; j++)
			arrChar[j - 1] = arrChar[j];
		arrChar[j - 1] = temp;
	}

	public static void displayWord() {
//		StringBuffer buff = new StringBuffer();
		if (count < 99)
			System.out.print("");
		if (count < 9)
			System.out.print("");
		System.out.print(++count + "");
		for (int j = 0; j < size; j++){
			System.out.print(arrChar[j]);
//			buff.append(arrChar[j]);
		}
//		if(buff.toString().charAt(0)!=')')
//		set.add(buff.toString());
//		sb.a
		System.out.print("");
		System.out.flush();
		if (count % 6 == 0)
			System.out.println("");
		System.out.println();
	}

	public static void main(String[] args) {
		String str = "dogs";
		size = str.length();
		for (int i = 0; i < str.length(); i++) {
			arrChar[i] = str.charAt(i);
		}
		Anagram.doAnagram(size);
		System.out.println("set");
		System.out.println(set.size());
	}
}
