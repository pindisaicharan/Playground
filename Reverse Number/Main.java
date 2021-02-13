#include <iostream>
int main() 
{
int num,i=0,r,a[2];
  std::cin>>num;
  while(num)
  {
    r=num%10;
    num=num/10;
    printf("%d",r);
  }
}