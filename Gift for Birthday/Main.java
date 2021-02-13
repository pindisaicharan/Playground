#include<iostream>
using namespace std;
int main()
{
  int year;
  std::cin>>year;
  switch(year%4)
  {
    case 0: std::cout<<year<<" is a leap year";
            break;
    default:std::cout<<year<<" is not a leap year";
  } 
}