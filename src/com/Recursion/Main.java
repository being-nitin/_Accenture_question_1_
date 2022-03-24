package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*
	  The function accepts two positive integers ‘r’ and ‘unit’ and a positive
	  integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number
	  of rats present in an area, ‘unit’ is the amount of food each rat consumes
	  and each ith element of array ‘arr’ represents the amount of food present in
	  ‘i+1’ house number, where 0 <= i

      Input Format
      input two positive integer input size of array input array

      Constraints
      -1
      Output Format

      Return -1 if the array is null Return 0 if the total amount of food from
      all houses is not sufficient for all the rats. Computed values lie within the integer range.

      Sample Input 0
      7
      2
      8
      2 8 3 5 7 4 1 2

      Sample Output 0
      4
	 */
        Scanner sc = new Scanner(System.in);
        int r,unit,size;
        r = sc.nextInt();
        unit = sc.nextInt();
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(solve(r,unit,arr.length,arr));
    }
    public static int solve(int r,int unit,int size,int[] arr){
        if(arr==null){
            return -1;
        }
        int res = r*unit;
        int count=0;
        int sum=0;
        for(int i=0;i<size;i++){
            sum = sum + arr[i];
            count++;
            if(sum>=res){
                break;
            }
        }
        if(sum<res){
            return 0;
        }
        return count;
    }
}
