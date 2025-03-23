// count the number of occurence of an element


import java.util.*;
public class q3{
static int ocecurrenec(int arr[],int x){
int count = 0;
for(int i=0;i<arr.length;i++){
    if (arr[i]==x){
        count++;
    }
}
return count;
}


    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
      int []arr =new int[n];
      System.out.println("enter the element");
      for(int i =0;i<arr.length;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("enter x");
      int x = sc.nextInt();

    System.out.println("count of "+ ocecurrenec(arr,x)); 
    }
}