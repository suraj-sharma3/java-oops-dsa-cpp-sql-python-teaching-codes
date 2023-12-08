/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// HashMap from collections framework : 

import java.util.*; // to import HashMap class, do import java.util.HashMap;
public class Main
{
	public static void main(String[] args) {
		HashMap<String, Integer> myMap = new HashMap<>(); // String & Integer are the datatypes of keys & values respectively
		myMap.put("Suraj Sharma", 13031995);
		myMap.put("Jyoti Sharma", 12032000);
		myMap.put("Yuvaan Vishwakarma", 12022018);
		myMap.put("Laxmi Mistry", 27121987);
	    System.out.println(myMap);
	    myMap.put("Laxmi Mistry", 26111989); // value for the key "Laxmi Mistry" will be updated
	    System.out.println(myMap);
	    System.out.println(myMap.containsKey("Jyoti Sharma")); // will return true as the key given is present in myMap
	    
	}
}
