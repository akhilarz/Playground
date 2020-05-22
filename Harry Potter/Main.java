#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x;
  std::cin>>x;
  int last_digit=x%10;
  int first_digit=x/1000;
  int final=last_digit+first_digit;
  std::cout<<final;
}