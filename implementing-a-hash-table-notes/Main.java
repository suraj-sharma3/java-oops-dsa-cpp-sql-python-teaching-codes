/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		HashTable table = new HashTable(10);
		table.put(27, "Suraj");
		System.out.println(table.size());
		table.put(24, "Shanvi");
		System.out.println(table.size());
		table.put(27, "Jyoti");
		System.out.println(table.size());
		System.out.println(table.get(24));
		System.out.println(table.get(95)); // as this key is not present in our HashTable, 'get' method will return null
	    System.out.println(table.remove(27));
	    System.out.println(table.remove(24));
	}
}



