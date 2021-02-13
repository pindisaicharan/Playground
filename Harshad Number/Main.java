#include<iostream>
using namespace std;
int main()
{
  int num,r,sum=0;
  std::cin>>num;
 int  temp=num;
  while(num)
  {
r=num%10;
    sum=sum+r;
    num=num/10;
  }
  if(temp%sum==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}