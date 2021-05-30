============================== STRING MATCHING=============================================================

Rashu got a task to match the characters inside the string. She got two different string as input and verify that if both have same length then the first three characters of both the strings are same or not. If same then print ‘Yes’ else print ‘No’.

Input Format

Enter two different strings of length ‘n’ separated by spaces.

Constraints

1<= n <= 20

Output Format

Print ‘Yes’ or ‘No’

Sample Input 0

aryan ary@@
Sample Output 0

Yes



SOLUTION==================================================================================================


import java.io.*;

import java.util.*;

import java.text.*;

import java.math.*;

import java.util.regex.*;


public class Solution {

   
 public static void main(String[] args) 
    {
      

 Scanner sc = new Scanner(System.in);
      
String s1=sc.next();
     
 String s2=sc.next();
      
      
if(s1.length()==s2.length())
      {
       
 char a1[]=s1.toCharArray();
        
char a2[]=s2.toCharArray();
        
        
if(s1.length()>=3)
        { 
          
if(a1[0]==a2[0] && a1[1]==a2[1] && a1[2]==a2[2]) 
System.out.print("Yes");
         
 else System.out.print("No");
        }
       
 else System.out.print("No");
     }
     
 else
      {
       
 System.out.print("No");
      
}
      
    
}

}
}

}