/*
 * 
 */
package myclasses.demos.ds.hashtable.seperatechaining;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class HashTableSeperateChainingApp.
 */
public class HashTableSeperateChainingApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner s = new Scanner(System.in);
		int enterSize = s.nextInt();
		int size=prime(enterSize);
		System.out.println("size: "+ size);
		HashTableSeperateChaining ht = new HashTableSeperateChaining(size);
		ht.insert(1);
		ht.insert(2);
		ht.insert(199);
		ht.insert(99);
		ht.insert(89);
		ht.insert(79);
		ht.insert(69);
		ht.insert(59);
		ht.insert(49);
		ht.insert(39);
		ht.insert(22);
		ht.find(199);
		ht.find(99);
		ht.find(89);
		ht.find(3);
		ht.delete(89);
		ht.displayHashTable();
		ht.delete(89);
		ht.displayHashTable();
		System.out.println("End");
	}
	
	/**
	 * find the next prime number.
	 *
	 * @param size the size
	 * @return the int
	 */
	public static int prime(int size){
		
		while(true){
			for(int i=2;i*i<size;i++){
				if(size%i==0){
					size++;
					i=2;
				}
			}
			return size;
		}
		
		
	}
}
