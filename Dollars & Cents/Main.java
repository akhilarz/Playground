#include<iostream>
using namespace std;
int main()
{
  int d1,d2,c1,c2,d,c,c3;
  cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  c=c1+c2;
  if(c>100){
    c2=c/100;
  cout<<d+c2<<"\n";
  c3=c-100;
    cout<<c3;}
  else{
    cout<<d<<"\n";
    cout<<c<<"\n";
}}