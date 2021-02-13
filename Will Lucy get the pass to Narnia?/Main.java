#include<iostream>
int main()
{
  int a,b;
  std::cout<<"Enter first number : Enter second number : Menu";
  std::cin>>a>>b;
  int c;
  std::cout<<"\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
  std::cin>>c;
  switch(c)
  {
    case 1:std::cout<<a+b;
            break;
    case 2:std::cout<<a-b;
           break;
    case 3:std::cout<<a*b;
      break;
    case 4:std::cout<<a/b;
      break;
    case 5:std::cout<<a%b;
      break;
    default:std::cout<<"Invalid operation";
          break;
  }
}