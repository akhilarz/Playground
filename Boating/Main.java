#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int bh,na,nc,d;
  cin>>bh;
  cin>>na;
  cin>>nc;
  d=75*na+30*nc;
  if (bh>d)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}