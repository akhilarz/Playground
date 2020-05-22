#include<iostream>
using namespace std;
int main()
{
  int a;
  float t,p;
  cin>>a>>t;
  if (a>13)
  {
    if(t<12)
    {cout<<"$8.00";
    }
    else 
      cout<<"$5.00";
  }
  else if (a<13)
  {
    if(t<12)
    {cout<<"$4.00";
    }
    else 
      cout<<"$2.00";
}
}