#include<iostream>
int main()
{
  int x,y,n,d;
 std::cout<<"Enter first number : ";
 std::cin>>x;
  std::cout<<"Enter second number : ";
  std::cin>>y;
  std::cout<<"Menu\n";
  std::cin>>n;
  std::cout<<"1.Addition \n2.Subtraction \n3.Multiplication \n4.Division \n5.Remainder\n";
  
  switch (n)
  {
    case 1:d=x+y;
      std::cout<<d;
      break;
      case 2:d=x-y;
      std::cout<<d;
      break;
      case 3:d=x*y;
      std::cout<<d;
      break;
      case 4:d=x/y;
      std::cout<<d;
      break;
      case 5: d=x%y;
      std::cout<<d;
      break;
      default : 
      std::cout<<"Invalid operation";
  }
}
      