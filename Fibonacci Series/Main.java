#include<iostream>
int main()
{
  int n,a=0,b=1,c;
  std::cin>>n;
  for(int i=2;i<n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  printf("The term %d in the fibonacci series is %d",n,c);
}