/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// Best Time to Buy and Sell Stock - Leet Code

// 1) By Brute Force Approach : Time Complexity - O(n^2), Space Complexity - O(1)

/* import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int prices[] = new int[n];
		for(int i = 0; i < n; i++){
		    prices[i] = scan.nextInt();
		}
		
		int maximum_profit = maxProfit(prices);
		System.out.println(maximum_profit);
	}
	
	public static int maxProfit(int prices[]){
	    int len = prices.length;
	    int maxprofit = 0;
	    for(int i = 0; i < len - 1; i++){ // we can't buy on the last day, bcoz then we wouldn't be able to sell
	        for(int j = i + 1; j < len; j++){ // we can sell only after we buy that's why 'j' starts with 'j + 1'
	            int profit = prices[j] - prices[i];
	            maxprofit = Math.max(profit, maxprofit);	        
	        }
	    }
	    return maxprofit;
	}
} */


// 2) Optimized Solution : Time Complexity - O(n), Space Complexity - O(1)

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int prices[] = new int[n];
		for(int i = 0; i < n; i++){
		    prices[i] = scan.nextInt();
		}
		
		int maximum_profit = maxProfit(prices);
		System.out.println(maximum_profit);
	}
	
	public static int maxProfit(int prices[]){
	    int len = prices.length;
	    int maxprofit = 0;
	    int buy_price = prices[0];
	    for(int i = 1; i < len; i++){ 
    	   if(prices[i] < buy_price){
    	       buy_price = prices[i];
    	   }
    	   else{
    	       int profit = prices[i] - buy_price;
    	       maxprofit = Math.max(profit, maxprofit);
    	   }
	    }
	    return maxprofit;
	}
}
