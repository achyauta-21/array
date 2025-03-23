// Single File Programming Question
// Problem Statement
// Vijay wants to create a program that allows inserting an element at a specific position in an array. The program should prompt the user to enter the position and the value to be inserted, then display the updated array with the new element in the specified position. Assist him with a suitable program.
// Input format :
// The first line of input consists of an integer n, which represents the size of the array.
// The second line of input consists of n space-separated integers representing the elements of the array.
// The third line of input consists of an integer i, which represents the position(1-based) to insert a new element.
// The last line of input consists of an integer m, which represents the value to be inserted at i.
// Output format :
// The output displays the original array before insertion and the updated array after insertion, in separate lines.
// If the position is not valid, print "Invalid position!".
// Refer to the sample output for formatting specifications.
// Code constraints :
// In this scenario, the test cases fall under the following constraints:
// 1 ≤ n ≤ 20
// 1 ≤ elements of the array ≤ 100
// 1 ≤ m ≤ 100
// Sample test cases :
// Input 1 :
// 5
// 1 2 3 4 5
// 3
// 10
// Output 1 :
// Original array: 1 2 3 4 5 
// Updated array: 1 2 10 3 4 5 
// Input 2 :
// 5
// 1 2 3 4 5
// 8
// 10
// Output 2 :
// Original array: 1 2 3 4 5 
// Invalid position!




import java .util.*; 
public class q2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the array size");
       int n = sc.nextInt();
       int arr[] = new int[n+1];
       for(int i = 1;i<=n;i++){
        arr[i]= sc.nextInt();
       } 
       System.out.println("enter the index");
       int index = sc.nextInt();
       System.out.println("enter the value");
       int value = sc.nextInt();
       if(index<n){
        for(int i = n;i>=index;i--){
            arr[i]=arr[i-1];

        }
        arr[index-1]=value;
        System.out.println("new array");
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
       }

    }
}
