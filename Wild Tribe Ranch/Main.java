#include <iostream>
int main()
{
  int mw,fw;
  std::cin>>mw>>fw;
  if (mw<fw)
    std::cout<<"Sorry, you can't enter";
  else if(mw>fw)
    std::cout<<"Yes, you can enter.";
  else
    std::cout<<"Yes, you can enter. Kindly use a rope.";
}