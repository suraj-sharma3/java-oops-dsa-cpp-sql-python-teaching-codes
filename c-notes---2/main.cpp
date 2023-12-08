/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <stdio.h>
using namespace std;
int main()
{
/*
    int x = 24;
    if(x > 24){
        cout << "Good Morning \n";
    }
    else if(x == 24){
        cout << "Good Afternoon \n";
    }
    else{
        cout << "Good Night";
    }
    
    string result = (x > 24) ? "Good Morning" : "Good Night \n";
    cout << result;
    
    int day = 2;
		switch(day){
		    case 1 : 
		        cout << "Monday \n";
		        break;
		    case 2 : 
		        cout << "Tuesday \n";
		        break;
		    case 3 : 
		        cout << "Wednesday \n";
		        break;
		    case 4 : 
		        cout << "Thursday \n";
		        break;
		    default : 
		        cout << "Sunday \n";
		}
		
		int i = 1;
		while(i <= 5){
		    cout << i <<endl;
		    i++;
		}
		
		for(int i = 0; i <= 10; i++){
		    cout << "Suraj \n";
		}
		
		int j = 5;
		do{
		    cout << j <<endl;
		    j--;
		}while(j >= 1);
		
		for(int i = 2; i <= 20; i++){
		    if(i % 2 == 0){
		        cout << i << endl;
		    }
		}
		
		for(int i = 0; i < 3; i++){
		    cout << "Hello \n";
		    for(int j = 0; j < 5; j++){
		        cout << "Suraj ";
		    }
		}
		
		string name12 = "Deadsoul";
		for(char x : name12){
		    cout << "\n" << x << endl;
		}
*/		
		int arr[5] = {1, 2, 3, 4, 5};
		cout << arr[2] << endl;
		
		string arr1[4] = {"Car", "Bar", "Star", "Shark"};
		cout << arr1[2] << endl;
		
		arr1[3] = "Bark";
		for(string s : arr1){
		    cout << s << endl;
		}
		
		for(int i = 0; i < 4; i++){
		    cout << i << "=" << arr1[i] << endl;
		}
		
		for(int i = 0; i < 5; i++){
		    cout << arr[i] << endl;
		}
		
		int arr21[] = {11,12,13,14,15};
		for(int y : arr21){
		    cout << y << endl;
		}
		
		int arr22[5];
		arr22[0] = 21;
		arr22[1] = 22;
		cout << arr22[1] << arr22[2] <<endl;
		
		cout << arr22.length;
    return 0;
    
    
}
