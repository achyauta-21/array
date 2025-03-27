# Conditional statement

age = int(input("enter the age"))
if(age >= 18):
    print("liscence is valid")
else:
    print("not valid")
    
    
    #  even or odd
    num= int(input("enter the number"))
    if(num%2 ==0):
        print("number is even")
    else:
        print("number is odd")
        
        # find the greatest num between two
        
        a = int(input("enter the number"))
        b = int(input("enter the number b"))
        c = int(input("enter the number c"))
        if(a>=b and a>=c):
            print("a is greater")
        elif(b>=c):
            print("b is greater")
        else:
            print("c is greater")
            
            
            #  LISTS [] = A built-in data type that stores set of values
            #  It can store element of different types(integer, float,string,etc)
            # String are immutable in nature and Lists are mutable in nature.
            # slicing is done in same way as in string
            marks = [1,3,6,8,67,24,897,"priya","achyauta"]
            print(marks)
            print(type(marks))
            print(marks[0])
            print(marks[1])
            print(len(marks))
            
            #  List methods or functions
            #  1) list.append(4)
            # 2) list.sort() . sort in ascending order
            # 3) list.sort( reverse = true) . sorts in decending order
            # 4) list.reverse() 
            # 5) list.insert(index,element)
            # 6) list.remove(1) . remove first 1 if it have more than 1 ,1
            # 7) list.pop(index)
            
            list = [2,1,3]
            list.append(4)
            print(list)
            list.sort()
            print(list.sort(reverse =True))
            
            
            # tuples in python ( )
            #  tuple are immutable in python
            
            tuple = (1,2,3,4,3,3,3,6)
            print(type(tuple))
            print(tuple)
            print(tuple(1))
            print(tuple(4))
            print(tuple.index(2))
            print(tuple[1:4])
            print(tuple.count(3))
            
            # palindrome
num = [1,2,2,4]
copy_num = num.copy()
copy_num.reverse()
if(copy_num == num):
    print("is palindrome")
else:
    print("not palindrome")

            
            