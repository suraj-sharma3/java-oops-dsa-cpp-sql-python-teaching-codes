/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <bits/stdc++.h>
using namespace std;

void printName(string str){
    cout << "Hello " << str << endl;
}

int addNum(int a, int b){
    return a + b;
}

int main()
{
/*
    cout << "Suraj \n";
    int age;
    cout << "Enter your age : ";
    cin >> age;
    cout << "Suraj is " << age << " years old\n";
    printf("Hello World\n");
    string str = "Shavit";
    printName(str);
    int a = 15;
    int b = 12;
    int ans = addNum(a, b);
    cout << ans << endl;
*/
/*
    // pair datatype :
    pair <int, int> myPair = {12, 15}; // This is how we can create a pair in C++, the datatypes stored could be any datatype even the pair datatype 
    cout << myPair.second << " " << myPair.first << "\n"; // This is how we can access the elements present in a pair
    // a pair object can contain elements of pair datatype also
    // we can use nested properties of pair object to store multiple elements in a pair
    
    // nested pairs : 
    pair <int, pair <int, int>> myNestedPair = {13, {14, 17}}; // the first element of the pair is an int but the second element of the pair is a pair only
    cout << myNestedPair.first << endl;
//    cout << myNestedPair.second << endl; // this doesn't works that means we can't print a pair
    cout << myNestedPair.second.first << endl; // accessing the first element of the nested pair present inside the myNestedPair object
    cout << myNestedPair.second.second << endl; // accessing the second element of the nested pair present inside the myNestedPair object
    // we can even make an array of pair datatype : we can store pairs as array elements, we can store pairs at array indices
    pair <int, int> arr[] = {{2, 4}, {11, 10}, {21, 29}};
    cout << arr[2].first << endl; // we can access the 'first' & 'second' elements in the pair present at any of the indices of the array
    cout << arr[1].second << endl;
 */  
 
 /* --- Start Of Vector ---
 
    // functions of vectors are important to understand as names of functions of other data structures in STL are also the same
    // the size of an array is fixed, we can't store elements more than the size of the array
    // we can't modify the size of an array, arrays have a constant size
    // Vectors are containers that are dynamic in nature, we can always increase the size of a vector whenever we want or need
    // whenever we need a data structure whose size we don't know & we want to insert as many elements as we want in it, we can use vector
    
    vector <int> myVect; // creates a vector (an empty container)
    myVect.push_back(33); // pushes 33 inside myVect
    myVect.emplace_back(86); // increases the size of myVect & inserts 86 in myVect
    // emplace_back is similar to push_back but emplace_back is faster than push_back
    // we can also create a vector of pair datatype, this vector will store pairs inside it
    vector <pair <int, int>> pairVect; // creating a vector of pair datatype
    pairVect.push_back({13, 14}); // inserting a pair in the vector using push_back
    pairVect.emplace_back(84, 86); // inserting a pair in the vector using emplace_back, emplace_back assumes (84, 86) as a pair & automatically inserts it in the vector as a pair
    // emplace_back is different from push_back in terms of syntax
    
    vector<int> newVect(6, 88); // a vector (container) containing '88' 6 times in it will be created
    // newVect has 88 in it from index 0 to index 5 i.e, it has 6 instances of 88 in it
    vector<int> yourVect(8); // a vector (container) containing 8 instances of any garbage value is created, 8 is the size that we have declared for this vector
    // we can always add more than 8 values in newVect, even when we give a size to a vector, that size is not fixed, it increases whenever we try to insert more elements in the vector
    vector<int> otherVect(newVect); // the elements of newVect will be copied in otherVect i.e, we are copying 1 vector into another vector
    // the indexing in vector is similar as indexing in array, it starts from 0


    vector<int> v1 = {56, 44, 82, 37, 62, 54, 99, 72}; 
    cout << v1[3] << endl; // we can access the elements of a vector using their index
    // vectorName[elementIndex] - this is how we can access elements of a vector by using their index
    cout << v1.at(6) << endl; // another way of accessing vector elements (not used much)
    
    // * is used to access anything that is stored at a particular memory address if we have the memory address of that thing
    // accessing vector elements using iterator
    vector <int> :: iterator myIter = v1.begin(); // myIter has the memory address of the first element present at index 0 in the vector v1
    // the name of the iterator could be anything
    // the begin function will access the memory address of the vector, it will point to the address of the starting index of the vector
    myIter++; // this is how we can move the iterator ahead to the other indexes from the starting index
    // now myIter moves one step & now it has the memory address of the second element present at index 1 in the vector v1
    cout << *(myIter) << endl; // * will access the element present at the address that myIter has
    // *(variable that has the address of an element) - syntax to access an element present at a particular address that you have
    
    // a few more iterators : 
    
    vector <int> :: iterator iter1 = v1.end(); // as we have used 'end', iter1 will get the address that is just after the address of the last element of the vector
    iter1--; // to make iter1 point to the address of the last element of the vector, we will decrement iter1 by 1 i.e, we'll move it one step back
    cout << *(iter1) << endl; // this will print '72' (last element of the vector)
    
    // the below 2 iterators 'rend' (reverse end) & 'rbegin' (reverse begin) are not used that much
//    vector<int> :: iterator iter2 = v1.rend(); // this will first reverse the vector & then it will point to the address that is just after the address of the last element of the reversed vector
    for rend() : 
    v1 = {56, 44, 82, 37, 62, 54, 99, 72}
    reversed v1 = {72, 99, 54, 62, 37, 82, 44, 56} 
    iter2 will point to the address which is just after the address of the last element of the reversed vector 
    we can also say that iter2 is pointing to the address which comes just before 56
    
    
//    vector<int> :: iterator iter3 = v1.rbegin(); // this will first reverse the vector & then it will point to the address of the first element of the reversed vector
    
    for rbegin() : 
    v1 = {56, 44, 82, 37, 62, 54, 99, 72}
    reversed v1 = {72, 99, 54, 62, 37, 82, 44, 56} 
    iter3 will point to the address of the last element of the vector v1
    & whenever we'll do iter3++, it will move to the address that is before the address of the last element
    iter3 will point to the address of 72 which is the first element in the reversed vector but the last element of the actual vector
    
    
    cout << v1.back() << endl; // back() means element at the last index in the vector
    
    // auto keyword : 
    
    int a = 5;
    auto b = 11; // even if we haven't mentioned the datatype of b, the computer automatically detects that the value of b is an integer therefore the datatype of b should be int
    cout << a << endl;
    cout << b << endl;
    // when we use 'auto', according to the value the datatype is automatically assigned to the variable
    
    // Iterating through a vector : 
    
    for(vector<int> :: iterator it = v1.begin(); it != v1.end(); it++){ // v1.end() will point to the index that is right after the index of the last element of the vector
        cout << *(it) << " ";
    }
    cout << endl;
    // using auto for datatype : 
    
    for(auto it = v1.begin(); it != v1.end(); it++){ // using auto with the iterator it will automatically assign vector<int> :: iterator datatype to it
        cout << *(it) << " ";
    }
    cout << endl;
    // using for each loop : 
    
    for(auto it : v1){
        cout << it << " ";
    }
    cout << endl;
    // deleting elements from a vector : 
    
    v1.erase(v1.begin() + 1); // this will erase the element at index 1 in the vector as v1.begin() points to the first index of the vector
    for(auto it : v1){
        cout << it << " ";
    } // output : 56 82 37 62 54 99 72
    cout << endl;
    // if we want to delete multiple elements from the vector : 
    
    v1.erase(v1.begin() + 1, v1.begin() + 4); // this will delete elements from index 1 to the index 3 (as v1.begin() + 4 will point to the index 4)
    // v1.erase(index from which you want to delete, index that comes after the index till whch you want to delete);
    for(auto it : v1){
        cout << it << " ";
    } // output : 56 54 99 72
    cout << endl;
    
    // inserting an element into a vector : use insert() function
    
    v1.insert(v1.begin(), 300); // this will insert 300 in the vector v1 at index 0
    for(auto it : v1){
        cout << it << " ";
    } // output : 300 56 54 99 72
    cout << endl;
    
    // inserting an element multiple times in a vector :
    
    v1.insert(v1.begin() + 2, 3, 26); // this will insert 26 three times in the vector from index 2 till index 4
    for(auto it : v1){
        cout << it << " ";
    } // output : 300 56 26 26 26 54 99 72
    cout << endl;
    
    // inserting a vector into another vector (not used much)
    
    vector<int> v2 = {5, 6, 2, 1};
    // now we'll insert v2 in v1
    v1.insert(v1.begin() + 3, v2.begin(), v2.end()); // this will insert the vector v2 (start to end) into vector v1 from index 3 in v1
    for(auto it : v1){
        cout << it << " ";
    } // output : 300 56 26 5 6 2 1 26 26 54 99 72
    cout << endl;
    
    // to get the size of the vector 
    cout << v1.size() << endl;
    
    // to pop the last element of the vector 
    v1.pop_back();
    for(auto it : v1){
        cout << it << " ";
    } // output : 300 56 26 5 6 2 1 26 26 54 99 
    cout << endl;
    
    // to swap 2 vectors 
    v1.swap(v2);
    for(auto it : v1){
        cout << it << " ";
    } // output : 5 6 2 1 
    cout << endl;
    for(auto it : v2){
        cout << it << " ";
    } // output : 300 56 26 5 6 2 1 26 26 54 99 
    cout << endl;
    
    // to erase everything from a vector
    v1.clear();
    for(auto it : v1){
        cout << it << " ";
    } // output : nothing as v1 has been cleared
    cout << endl;
    
    vector<int> v3 = {5, 9, 7, 2, 6, 4, 8};
    v3.clear();
    for(auto it : v3){
        cout << it << " ";
    } // output : nothing as v3 has been cleared
    cout << endl;
    
    // to check if the vector is empty or not
    
    cout << v2.empty() << endl; // returns 0 if vector is not empty & returns 1 if vector is empty
    
    // insert function of a vector is costlier or expensive time complexity wise
*/ //  --- End Of Vector --- 

// --- Start Of List ---

// List is exactly similar to vector, the only difference is it gives us front operations as well
    // for a vector, a singly linked list is maintained internally
    // for a list, a doubly linked list is maintained internally
/*   
    list <int> myList;
    myList.push_back(3); // pushes an element from the back
    myList.emplace_back(5); // pushes an element from the back
    myList.push_front(18); // pushes an element from the front
    myList.emplace_front(21); // pushes an element from the front
    myList.push_back(3); 
    myList.emplace_back(5);
    for(auto it : myList){
        cout << it << " ";
    }
    cout << endl;
    
    // all the other functions like begin, end, rbegin, rend, clear, insert, size, swap in list are same as vector

*/ // --- End of List ---

/*
// --- Start of Deque ---

    deque <int> myDq;
    myDq.push_back(5); // to push an element from the back
    myDq.emplace_back(8); // to push an element from the back
    myDq.push_front(19); // to push an element from the front
    myDq.emplace_front(23); // to push an element from the front
    cout << myDq.back() << endl; // to peek or get the last element or element at the back of the deque
    cout << myDq.front() << endl; // to peek or get the first element or element at the front of the deque
    myDq.pop_back(); // to pop an element from the back
    myDq.pop_front(); // to pop an element from the front
    
    
// all the other functions like begin, end, rbegin, rend, clear, insert, size, swap in Deque are same as vector
*/

// --- Start Of Stack --- LIFO
/*
    stack <int> myStack;
    myStack.push(44);
    myStack.emplace(89);
    myStack.push(48);
    myStack.push(83);
    myStack.push(56);
    myStack.push(92); // 92(top) 56 83 48 89 44 : myStack at this point
    myStack.pop(); // 92 (element at the top of the stack) will be popped, pop means delete
    cout << myStack.top() << "\n"; // returns the element which is at the top of the stack, top is similar to peek
    // push, pop & top are the most used function - TC : O(1)
    // to iterate over a stack
    cout << myStack.size() << "\n"; // returns the size of the stack
    while(!myStack.empty()){
        cout << myStack.top() << endl;
        myStack.pop();
    }
    cout << myStack.empty() << "\n"; // tells if the stack is empty or not
    
    stack <int> st1, st2;
    
    st1.push(23);
    st1.push(28);
    st1.push(29);
    st1.push(33);
    
    st2.push(56);
    st2.push(89);
    st2.push(63);
    st2.push(79);
    
    st1.swap(st2);
    
    cout << "elements of st1" << endl;
    while(!st1.empty()){
        cout << st1.top() << endl;
        st1.pop();
    }
    
    cout << "elements of st2" << endl;
    while(!st2.empty()){
        cout << st2.top() << endl;
        st2.pop();
    }
    // --- End Of Stack ---
*/   
    // --- Start Of Queue --- FIFO
/*    
    queue <int> myQueue;
    myQueue.push(56);
    myQueue.push(83);
    myQueue.push(99);
    myQueue.emplace(46);
    myQueue.emplace(64);
    
    cout << myQueue.front() << endl;
    cout << myQueue.back() << endl;
    
    myQueue.back() += 15; // this will add 15 to the element present at the back of the queue
    cout << myQueue.back() << endl;
    
    myQueue.pop(); // element at the front gets deleted
    
    while(!myQueue.empty()){
        cout << myQueue.front() << " ";
        myQueue.pop();
    }
    cout << endl;
    cout << myQueue.size() << endl;
    cout << myQueue.empty() << endl;
    // --- End Of Queue ---
*/   
   
    // --- Start Of Priority Queue ---
    
    // the largest element stays at the top of a priority queue
    // for a string, the lexicographically greatest string stays at the top
    
    // inside of a priority queue, a tree data structure is maintained internally
/*    
    priority_queue <int> pq;
    pq.push(46);
    pq.push(97);
    pq.push(85);
    pq.push(43);
    pq.emplace(99);
    // elements will be stored in descending order from top to bottom in this pq i.e, 99 97 85 46 43
    // elements are stored in order of their priority in the priority queue
   
    while(!pq.empty()){
        cout << pq.top() << " ";
        pq.pop();
    }
    cout << endl;
   
    pq.pop(); // the element which is at the top (element with the highest priority) will get popped
    
    cout << pq.size() << endl;
    cout << pq.empty() << endl;
    
    cout << pq.top() << endl; // returns the element which is at the top of the priority queue
    
    // if we want a priority queue that stores the smallest element at the top (follows ascending order from top to bottom)
    priority_queue<int, vector<int>, greater<int>> myPriority;
    myPriority.push(45);
    myPriority.push(97);
    myPriority.push(83);
    myPriority.push(56);
    myPriority.emplace(67);
 /*   
    while(!myPriority.empty()){ // this doesn't work, we can't iterate over a priority queue
        cout << pq.top() << " ";
        pq.pop();
    }
    cout << endl;
*/
/*
    cout << myPriority.top() << endl;
    
    // priority queue that stores the smallest element at the top - also known as Min heap
    // priority queue that stores the largest element at the top - also known as Max heap
    
    // TC : push - O(logn), pop - O(logn), top - O(1)
*/    
    // --- End Of Priority Queue ---
    
    // --- Start Of Set ---
    
//  set stores everything in a sorted order & it only stores unique elements
// we can't insert an element more than once in a set & the set will always store elements in a sorted order
// set is implemented using tree internally

    set<int> mySet;
    mySet.insert(24);
    mySet.insert(46);
    mySet.insert(85);
    mySet.insert(108);
    mySet.insert(12);
    mySet.insert(33);
    mySet.emplace(66);
    mySet.emplace(64);
    
    // begin, end, rbegin, rend, size, swap, empty are the same in set as they were for the above data structures
    
    auto it = mySet.find(12); // address of 12 is stored in it
    auto it1 = mySet.find(17); // even if an element is not present in the set, the address of the index that comes after the last index of the set is stored in it
    
    mySet.erase(33); // this will remove 33 from the set but it will still maintain the sorted order
    
    int countOf64 = mySet.count(64); // this will return the count of number of occurrence of 64 which can either be 1 or 0 as an element can only be present once in a set
    
    // we can even provide the address of the element that we want to erase from the set to the erase function
    
    auto it2 = mySet.find(46);
    mySet.erase(it2); // we are providing the address of the element that we want to delete
    
    // if we want to erase a range of elements from the set at once
    auto itStart = mySet.find(85);
    auto itEnd = mySet.find(66);
    mySet.erase(itStart, itEnd); // this will delete elements from the itStart (including the element at itStart) to the itEnd (till the element that is just before the element at itEnd)
    
    set<int> mySet1;
    mySet1.insert(11);
    mySet1.insert(13);
    mySet1.insert(15);
    mySet1.insert(33);
    
    for(auto it : mySet){
        cout << it << " ";
    }
    cout << endl;
    
    for(auto itr = mySet1.begin(); itr != mySet1.end(); itr++){
        cout << *(itr) << " ";
    }
    cout << endl;
    // Binary Search using stl : 
    
    int arr[] = {3, 7, 5, 9, 2, 56, 27, 33, 36, 84, 17};
//    auto a = arr.begin();
    bool result = binary_search(arr, arr + 11, 27);
    cout << result << endl;
    return 0;
}


