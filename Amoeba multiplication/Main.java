#include<iostream>
using namespace std;
int main()
{
    int a = 0, b = 1, c, i,n; 
  cin>>n;
  if( n == 0) 
    cout<<n; 
  for (i = 2; i <= n; i++) 
  { 
     c = a + b; 
     a = b; 
     b = c; 
  } 
  cout<<a;
}
