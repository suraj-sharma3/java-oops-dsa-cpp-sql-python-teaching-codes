/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, COBOL, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <bits/stdc++.h>
using namespace std;

int main()
{
    // --- Start Of Set ---
    
//  set stores everything in a sorted order & it only stores unique elements
// we can't insert an element more than once in a set & the set will always store elements in a sorted order
// set is implemented using tree internally
/*
    set<int> mySet;
    mySet.insert(24);
    mySet.insert(46);
    mySet.insert(85);
    mySet.insert(108);
    mySet.insert(12);
    mySet.insert(33);
    mySet.emplace(66);
    mySet.emplace(64);
    
    for(auto it : mySet){
        cout << it << " ";
    }
    cout << endl;
    
    for(auto itr = mySet.begin(); itr != mySet.end(); itr++){
        cout << *(itr) << " ";
    }
    cout << endl;
    
    // begin, end, rbegin, rend, size, swap, empty are the same in set as they were for the above data structures
    
    auto it = mySet.find(12); // address of 12 is stored in it
    auto it1 = mySet.find(17); // even if an element is not present in the set, the address of the index that comes after the last index of the set is stored in it
    
    mySet.erase(33); // this will remove 33 from the set but it will still maintain the sorted order
    
    int countOf64 = mySet.count(64); // this will return the count of number of occurrence of 64 which can either be 1 or 0 as an element can only be present once in a set
    cout << countOf64 << endl;
    // we can even provide the address of the element that we want to erase from the set to the erase function
    
    auto it2 = mySet.find(46);
    mySet.erase(it2); // we are providing the address of the element that we want to delete
    
    for(auto it1 : mySet){
        cout << it1 << " ";
    }
    cout << endl;
    // if we want to erase a range of elements from the set at once
    auto itStart = mySet.find(85);
    auto itEnd = mySet.find(66);
    mySet.erase(itStart, itEnd); // this will delete elements from the itStart (including the element at itStart) to the itEnd (till the element that is just before the element at itEnd)
    
    for(auto it1 : mySet){
        cout << it1 << " ";
    }
    cout << endl;
*/    
    // Binary Search using stl : 
    
    int arr[] = {3, 7, 5, 9, 2, 56, 27, 33, 36, 84, 17};
    bool result = binary_search(arr, arr + 11, 27);
    cout << result << endl;

    return 0;
}
