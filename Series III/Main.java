#include<iostream>
int main()
{
  int n,b=6;
  std::cin>>n;
  for(int i=0;i<n;i++)
  {
  b=b+(i*5);
    printf("%d ",b);
  }
}