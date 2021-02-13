#include<iostream>
using namespace std;
int main()
{
  int r,l;
  std::cin>>r>>l;
  if(2*r>l)
  {
    std::cout<<"circle cannot be inside a square";
  }
  else
    std::cout<<"circle can be inside a square";
}