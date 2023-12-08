/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>
#include <string>
#include <cmath>

using namespace std;

int main()
{
/*    cout<<"Hello World" << endl;
    int x;
    cout<< "Enter a number : ";
    cin>> x;
    cout<< "The number you've entered is " << x << endl;
    cout<< "Enter another number : ";
    int y;
    cin >> y;
    cout << x + y <<endl;
    double myNum = 14e5;
    float myNum1 = 523E4;
    cout << myNum1 <<endl;
    
    float f1 = 35E3;
    double d1 = 12e4;
    cout << f1 <<endl;
    cout << d1 <<endl;
    
    bool yuvaan = true; // 1
    bool suraj = false; // 0
    cout << yuvaan;
*/   
/*
    char ch = 'a';
    cout << ch <<endl;
    char ch1 = 97;
    cout << ch1 <<endl;
    char ch2, ch3, ch4;
    ch2 = ch3 = ch4 = 'l';
    cout << ch3 <<endl;
    
    string name = "Suraj";
    cout << name + " is my name" << endl;
    
    int num1 = 44;
    int num2 = 87;
    int num3 = num1 + num2;
    cout << num3 << endl;
    
    int a = 24;
    int b = 4;
    int c = a - b;
    cout << c <<endl;
    cout << ++a << "\n";
    cout << --a << "\n";
    cout << a++ << "\n";
    cout << a-- << "\n";
    cout << a << "\n";
    
    cout << (3 > 5) << "\n";
    cout << (3 < 5) << "\n";
    cout << (3 <= 5) <<"\n";
    cout << (3 == 5) << "\n";
    cout << (3 >= 5) << "\n";
    cout << (3 > 5 && 5 > 4) << " \n";
    cout << (3 > 5 || 5 > 4) << " \n";
    cout << !(3 > 5 || 5 > 4) << " \n";
    
    string name1 = "suraj";
    string surname = "sharma";
    string fullName = name1 + " " +  surname;
    cout << fullName <<endl;
    
    string naam = "shanvi";
    string lastName = "Sharma";
    string fullName1 = naam.append(" " + lastName);
    cout << fullName1 <<endl;
    
    int alpha = 24;
    string beta = "Neoplasm";
    // cout << alpha + beta;
*/
/*
    string str = "Hi, I am Suraj Sharma";
    cout << str.size() << "\n";
    cout << str.length() << "\n";
    cout << str[4] << "\n";
    str[1] = 'e';
    cout << str << "\n";
    std::cout << str << std::endl;
    cout << "My name is Suraj\\ Sharma\'s\"" << endl;
    cout << "My \n name is \t Suraj\\ Sharma\'s\"" << endl;
    string city;
/*    cout << "Enter your city \n";
    cin >> city;
    cout << "You live in " + city << endl;
*/
    string address;
    cout << "Enter your address : ";
    getline(cin, address);
    cout << "\n" + address << endl;
    cout << max(12, 13) << endl;
    cout << min(1, 99) << endl;
    cout << sqrt(36);
    std::cout << abs(83.97564) << std::endl;
    int x = 25;
    int y = 84;
    cout << (x < y) << endl;
    int age;
    cin >> age;
    if(age == 18){
        cout << "you can vote \n";
    }
    else if(age > 18){
        cout << "You can definitely vote \n";
    }
    else{
        cout <<"You can't vote";
    }
    bool myTurn = true;
    cout << myTurn;
    return 0;
}

