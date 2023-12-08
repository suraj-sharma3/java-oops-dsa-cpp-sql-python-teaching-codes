/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        long num = scan.nextInt();
        long reversed = 0;
        while(num > 0){
          long digit = num % 10;
          reversed = reversed*10 + digit;
          num = num / 10;          
        }
      System.out.println(reversed);
	}
}
