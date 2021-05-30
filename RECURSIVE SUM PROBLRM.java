============================== RECURSIVE SUM=============================================================

You need to find the sum of digits of a number ‘n’ using recursion.

Note: Solve this question using recursion only.

Input Format

Enter the number ‘n’.

Constraints

1<= n <= 5000

Output Format

Print the sum

Sample Input 0

499
Sample Output 0

22





SOLUTION==================================================================================================


import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;


public class Solution {

   
 public static void main(String[] args) 
    {
      
Scanner sc =new Scanner(System.in);
      
int n=sc.nextInt();
      
int x,sum=0;
      
while(n>0)
      
{
       
 x=n%10;
        
sum=sum+x;
       
 n=n/10;
     
 }
     
 System.out.print(sum);
  
  }

}