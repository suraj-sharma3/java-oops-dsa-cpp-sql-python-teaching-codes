/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
/*

logical operators are used in pattern programs
logical operators are used with boolean values & their end result is also a boolean value

logical and - &&
logical or - ||
logical not - !

&& : TTT (if all expressions are true only then the end result is true)
|| : FFF (if all expressions are false only then the end result is false)
! : !true means false, !false means true

If else concept is used whenever you want to create a program that uses conditions
only 1 block can be executed from if else

if the condition in if block is true, then if block is executed
if the condition in if block is false, then else block is executed

else if can be used as many times as you want
only 1 block from "if else if else" ladder can be executed

only the block for which the condition is true will be executed
if the conditions in all the blocks is true, then only the first block in the ladder will be executed & remaining will be skipped

nesting : you can add as many conditions or ladders as you want in any of the blocks of the ladder
you can nest as many times as you want in as many blocks as you want in the "if else if else" ladder

only 1 block can be executed from the "if else if else" ladder, no matter how many conditions are true or false & no matter how many times the blocks of the ladder have been nested

TERNARY OPERATOR : 

BASIC SYNTAX : (IF CONDITION)? IF_BLOCK : ELSE_BLOCK; // if the condition provided is true, the part before the colon is executed, if the provided condition is false then the part after the colon is executed

(condition) ? condition_true_part : condition_false_part;
// condition - if condition, condition_true_part - if block, condition_false_part - else block

e.g. int a = 10, int b = 20, int ans = 0;

ans = (a > b)? a : b; // this means if a > b, then return a & store it in ans else return b & store it in ans

String result = (a > b)? "a is greater" : "b is greater";
// if a > b (if condition), "a is greater" will be stored in result else "b is greater" will be stored in the result

if condition is in the parenthesis, if block is after ? & before :, else block is after : (colon).

int result = (a > b)? (a > c? a : c) : (b > c? b : c); 
if condition ? nested if else in if block : nested if else in else block;

// if a > b then we'll check if a > c, if a > c then we'll return a else b, if a < b we'll go to the else part after the colon & we'll check if b > c, if b > c then we'll return b else we'll return c 

int result = (a > b)? (a > c? a : c) : (b > c? b : c); // this is equivalent to the below given if else ladder 

if(a > b){
    if(a > c){
        result = a;
    }
    else{
        result = c;
    }
}
else{
    if(b > c){
        result = b;
    }
    else{
        result = c;
    }
}

// ternary operator is just a shortcut for if else 

Switch Case : 

switch case executes a case on the basis of equality

e.g. 
switch (expression){
    case expression1 : statement1;
    break;
    case expression2 : statement2;
    break;
    case expression3 : statement3;
    break;
    default : statement4;
}

the expression provided within parenthesis to switch will be compared with all the cases given,
the statement of the case which matches the switch expression will be executed
we should write break after every case, so that only 1 case executes at a time
if 1 case matches, only the statement of that case should execute, to make sure this happens, we have to use break after every case 
if we don't use break, the case which matches executes & also the remaining cases execute too

default statement executes when none of the cases match the switch expression 

LOOPS : 

for each loop is also called as enhanced for loop

types of loops : for, while, do while, for each 

Loops consist of 4 parts : initialization, condition check, body (task) & updation  

for(initialization; condition check (termination condition) : updation){
    body (task);
}

initialization occurs only once 
condition check, body, updation occur continuously until condition becomes false

sequence of process in loop : 

1) initialization (occurs only once at the start & doesn't repeats)
The below steps are repeated until the condition becomes false
once the condition becomes false, the repetition of these steps stops 
2) condition check
3) body or task
4) updation

1) -> 2) -> 3) -> 4) -> 2) -> 3) -> 4) -> 2) -> 3) -> 4) -> 2) -> 3) -> 4) -> 2) -> 3) -> 4) until the condition becomes false


