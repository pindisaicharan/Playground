#include<iostream>
int main()
{
  int num1,num2,i,num,sum=0;
  std::cin>>num1>>num2;
  num=num1+num2;
  for(i=1;i<num;i++)
  {
    if(num%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==num)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}
