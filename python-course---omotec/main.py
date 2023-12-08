'''

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

'''
# Python Course : 

# Level 1 : 

# Session 1 : 

'''
print('Hello')

num = int(input("Enter a number : "))

print(num + 25)
'''

# Session 2 : 

'''
a = 23
print(type(a))

a = str(a)
print(type(a))

character = "S"
print(type(character))

my_sent = 'whatever'
my_sent1 = "whoever"
my_sent2 = """wherever"""

print(type(my_sent2))

ans = True

print("the datatype of ans variable is " + str(type(ans)))

myList = [23,87,56, "Suraj", False, 36.69] # multidimesnsional object or multidimesnsional list (as there's a string inside this list)
print(myList[3])

myList1 = [23, 25, [87, 96, 38, 44], 56, 35, 66] # multidimesnsional object or multidimesnsional list

print(myList1[2][3])

print(my_sent1[5])

# Session 3 : 

print(myList1[len(myList1) - 1])

print(myList1[2 : 4])

myList2 = [1, 5, 6, 8, 9, 7, 17, 15, 43, 27, 95]

print(myList2[3 : 8 : 2])

print(myList2[::-1])

print(8**2) 
print(8 / 3)
print(8 // 3) # floor division
print(36**(1/2))
'''

'''
num1 = int(input("Enter a number : "))
num2 = int(input("Enter another number : "))

print(num1 % num2) # remainder
print(num1 / num2) # quotient with decimal places
print(num1 & num2) # bitwise and
'''

# Session 4 :
'''
sent1 = "how are you"
sent2 = "where do you live"
if sent1 == sent2:
    print("both the sentences match")
    
if sent1 != sent2:
    print("the sentences don't match")
else:
    print("whatever")
    
score = 45

if score > 90:
    print("awesome")
elif score < 90 and score > 80:
    print("you need to work hard")
elif score < 80 and score > 70:
    print("What?")
elif score < 70 and score > 60:
    print("Disappointed")
else:
    print("either awesome or awestruck")
    
new_list = [23, 24, 29, 72, 56, 54, 98]

new_list.append(43)
print(new_list)
new_list.insert(5, "Shavit")
print(new_list)

my_str = "whatever, whoever, wherever"

print(my_str.upper())
print(my_str.split())

new_list[5] = 26

print(new_list)

my_str[8] = "w" # string object does not support re-assignment
'''
'''
year = int(input("Enter a year : "))

if year % 100 == 0:
    if year % 400 == 0:
        print("Leap Year")
    else:
        print("Not a leap year")
else:
    if year % 4 == 0:
        print("Leap Year")
    else:
        print("Not a leap year")

x = "Hello, How, Are, You"

str_list = x.split(",")

print(str_list)
print(str_list[2])
'''

# Session 5 : 
'''
num = int(input("Enter a number : "))
for i in range(0, 11):
    print(str(num) + " * " + str(i) + " = " + str(num*i))
'''
'''
num = int(input("Enter a number : "))
i = 1 
while i < 11:
    print(str(num) + " * " + str(i) + " = " + str(num*i))
    i = i + 1

print(range(0, 100)) # this wouldn't work
print(list(range(0, 100))) # this would work
print(str(range(0, 100))) # this also wouldn't work

another_list = list(range(0, 90, 9))
print(another_list)

even_list = list(range(2, 101, 2))
print(even_list)

for i in range(0, 100, 8):
    if i % 3 == 0:
        continue
    if i % 4 == 0:
        pass
    if i % 7 == 0:
        break
    print(i)


ans_list = []
other_str = "The quick brown fox jumped over the fence & disappeared into the forest"
list_storing_str = list(other_str.split())
for i in list_storing_str:
    if i[0] == 'f':
        ans_list.append(i)
print(ans_list)
        

for i in range(0, 5):
    for j in range(0, i + 1):
        print("* ", end = "")
    print()
    
print("\n")
    
    
for i in range(0, 5):
    for j in range(0, 5 - i):
        print("* ", end ="")
    print()
    
for i in range(0, 5):
    for j in range(0, 5 - i):
        print(" ", end = "")
    
    for k in range(0, i):
        print("* ", end = "")
        print()
    
       
for i in range(0, 5):
    for j in range(0, 5):
        print(" ", end = "")
    for k in range(0, i + 1):
        print("* ", end = "")
    print()
'''

'''
# ask to enter a character until you get a 'q'
user_list = []
flag = True
while flag:
    char = input("Enter a character : ")
    if char == 'q':
        flag = False
    else:
        user_list.append(char)
print(user_list)
''' 

''' 
# Guesser Game :

ans = 27
i = 1 
flag = True
while i <= 5:
    random = int(input("Enter a number : "))
    if random == ans:
        print("You Won")
    else:
        if random < ans:
            print("Try again, the number you entered is less than the answer")
        else:
            print("Try again,the number you entered is greater than the answer")
    if i == 5:
        if random != ans:
            print("You have lost")
    i = i + 1
'''
'''
num = int(input("Enter a number : "))
print()
for i in range(0, num + 1):
    for j in range(0, num - i):
        print("* ", end ="")
    print()
'''
'''
# Pattern problems :
for i in range(0, 6):
    for k in range(0, 6 - i):
        print(" ", end = "")
    for x in range(0, i + 1):
        print("*", end = "")
    print()
    
for i in range(0, 6):
    for k in range(0, 6 - i):
        print(" ", end = "")
    for x in range(0, i + 1):
        print("* ",end = "")
    print()
 

for i in range(0, 101):
    if i % 3 == 0 and i % 5 == 0:
        print("FizzBuzz")
    elif i % 5 == 0:
        print("Buzz")
    elif i % 3 == 0:
        print("Fizz")
    else:
        print(i)
        


# Session 6 : 

def add_num(num1, num2):
    return num1 + num2
    
ans = add_num(25, 26)
print(ans)

# checking prime :

num = int(input("Enter a number : "))
ans = ""
for i in range(2, num):
    if num % i == 0:
        ans = str(num) + " is not a prime number"
        break
    else:
        ans = str(num) + " is a prime number"
print(ans)
'''
# palindrome checker : 
'''
user_sent = input("Enter a string : ")
if user_sent == user_sent[::-1]:
    print("The entered string " + user_sent + " is a palindrome")
else:
    print("The entered string " + user_sent + " is not a palindrome")


user_entry = input("Enter a string : ")
reversed_list = []
k = len(user_entry) - 1
for i in user_entry:
    reversed_list[k] = i 
    k = k - 1
    
x = 0
for j in user_entry:
    entry_list[x] = j 
    x = x + 1
    
if entry_list == reversed_list:
    print("Palindrome")
else:
    print("Not a palindrome")


# factorial :

ques_num = int(input("Enter a number : "))
fact = 1
for i in range(2, ques_num + 1):
    fact = fact * i
print(fact)

# Fibonacci :

user_num = int(input("Enter a number : "))
fibo_list = [0, 1]
for i in (2, user_num + 1):
    fibo_list[2] = fibo_list[i - 1] + i 
    
print(fibo_list)


# correct one : Fibonacci
n1 = 0 
n2 = 1 

count = 0 
user_entry = int(input("Enter a number : "))
while(count < user_entry):
    print(str(n1) + " ", end = "")
    n3 = n2 + n1 
    n1 = n2 
    n2 = n3
    count =  count + 1
''' 
# Session 7 : 

# tuples :

first_tup = (1, 3, 5.5, 63, "shavit", 89, 97, "suraj")
print(first_tup[3])
print(first_tup[2 : 6 : 2])

print(len(first_tup))

# first_tup[2] = "dead" # wouldn't work as tuple doesn't supports item re-assignment
print(first_tup)
# print(first_tup[2])
    
print(first_tup.count("suraj"))
print(first_tup.index("shavit"))

