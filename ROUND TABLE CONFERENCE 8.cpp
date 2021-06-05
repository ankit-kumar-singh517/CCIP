----------------------------- ROUND TABLE CONFERENCE--------------------------------------------------------------------------------------------------------------------------------
  
In a round table conference the comissioner decided to meet with ‘n’ junior fellows. All the fellows along with commisioner will sit around a table. In how many ways they can sit around the table.

Input Format

Enter the value of ‘n’

Constraints

5 <= n <=10

Output Format

Print the output.

Sample Input 0

6
Sample Output 0

360



OUTPUT -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#include <cmath>

#include <cstdio>

#include <vector>

#include <iostream>

#include <algorithm>

using namespace std;

int fact(int n)
{
    if(n<1)
        return 1;
    
else
  
 return n*fact(n-1);

}


int main()
 {
  
  int n;
   
 cin>>n;
   
 int f= fact(n);
    
int q=f/2;
   
 cout<<q;
   
 /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
   
 return 0;

}