----------------------------- ONE ONE FUNCTION--------------------------------------------------------------------------------------------------------------------------------



OUTPUT -------------------------------------------------------------------------------------------------------------------------------------------------------------------------

#include <cmath>

#include <cstdio>

#include <vector>

#include <iostream>

#include <algorithm>

using namespace std;

int fact(int n)

{
    
if(n<=1)
    
{
       
 return 1;
    
}
    
else
       
 return n*fact(n-1);

}


int main() 
{
    
int n,m,temp;
    
cin>>m>>n;
    
int f=fact(m);
    
int a=fact(m-n);
   
 temp=f/a;
   
 cout<<temp;
    
    
 return 0;

}