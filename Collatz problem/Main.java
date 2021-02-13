#include<iostream>
using namespace std;
int main()
{
  int num,i=0;
  std::cin>>num;
  std::cout<<num<<"\n";
  while(num>1)
  {
  if(num>1 && num%2==0)
  {
num=num/2;
    std::cout<<num<<"\n";
  }
  else if(num>1 && num%2!=0)
  {
    num=3*num+1;
    std::cout<<num<<"\n";
  }
    i++;
  }
  std::cout<<i<<"\n";
    
}