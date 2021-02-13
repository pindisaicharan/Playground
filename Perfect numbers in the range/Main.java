#include<iostream>
int main()
{
  int n1,n2,sum=0;
  std::cin>>n1>>n2;
  for(int i=n1;i<=n2;i++)
  {
for(int j=1;j<i;j++)
{
  if(i%j==0)
  {
sum=sum+j;
  }
}
    if(i==sum)
    {
      std::cout<<i<<" ";
    }
    sum=0;
  }
}