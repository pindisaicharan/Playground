#include<iostream>
int main()
{
  int n,b;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    int b=(11+4*(i-1))*(11+4*(i-1));
    printf("%d ",b);
  }
}