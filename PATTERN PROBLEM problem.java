=================================== PATTERN PROBLEM 3====================================================================


Print the corresponding pattern for different values of ‘n’

Input Format

Enter the value of ‘n’.

Constraints

1<= n <= 10

Output Format

Print the required pattern

Sample Input 0

3
Sample Output 0

***
**
*


SOLUTION=============================================================================


import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;
public class Solution {

    public static void main(String[] args)
    
{
     
Scanner sc = new Scanner(System.in);
      
int n=sc.nextInt();
      
      
for(int i=1;i<=n;i++)
     
 {
       
for(int j=n;j>=i;j--)
    
   {
         
System.out.print("*");
      
 }
       
 System.out.print("\n");
      
 }
  
  }

}
