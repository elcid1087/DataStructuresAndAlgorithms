package myclasses.demos.ds.arrays;

public class Palindrome {

	
	public static void main(String[] args) {
		boolean isPalindrome = palindrome(i1);
		System.out.println("isPalindrome "+ isPalindrome);
		System.out.println(1223%1000);
	}
	static int i1 = 112211;
	static int i2 = i1;
	static int base = 10;
	public static boolean palindrome(int input){
		if(input==0){
			return true;
		}else{
			boolean b = palindrome(input/10);
			if(b==false){
				return false;
			}
			if(input%10!=i2%10){
				return false;
			}
			base = base*10;
			i2=i2/10;
			return true;
			
		}
	}
	
}
