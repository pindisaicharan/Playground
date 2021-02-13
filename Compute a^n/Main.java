#include<iostream>
using namespace std;
int main()
{
  int a,n,pow=1;
  std::cout<<"Enter the value of a\n";
  std::cin>>a;
  std::cout<<"Enter the value of n\n";
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    pow=a*pow;
  }
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<pow;
}