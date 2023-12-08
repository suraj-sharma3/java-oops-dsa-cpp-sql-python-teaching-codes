/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		MyHashTable table = new MyHashTable(10);
        table.put(105, "Tom");
        table.put(21, "Harry");
        table.put(31, "Dinesh");
        System.out.println(table.size());// (31, "Dinesh") -> (21, "Harry") -> null
        System.out.println(table.remove(21));
        System.out.println(table.remove(31));
        System.out.println(table.size());
	}
}
