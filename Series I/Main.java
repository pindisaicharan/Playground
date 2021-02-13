#include<iostream>
int main()
{
  float a=0.5;
  float b;
  int n;
  std::cin>>n;
   std::cout<<a<<" ";
  for(int i=1;i<n;i++)
  {
   if(n==1)
     break;
  else
  {
      // std::cout<<a;
      a=a*3;
    printf("%.1f ",a);
  }
  }
}
 