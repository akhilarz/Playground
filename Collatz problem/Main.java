#include<iostream>
using namespace std;
int main()
{
  int n,c=0;
  cin>>n;
  cout<<n<<"\n";
  while (n!=1)
  {
    
     if (n & 1) 
            n = 3*n + 1; 
  
        // If even 
        else
            n = n/2;
    cout<<n<<"\n";
    c++;
    }cout<<c;
    
}