#include<iostream>
using namespace std;
int main()
{
  int n;
  g:cin>>n;
  int a[n];
  int odd=0,even=0;
  if(n>15)
    goto g;
  else
    for(int i=0;i<n;i++)
    {
      cin>>a[i];
    if(a[i]%2==0)
      even=even+a[i];
      else
        odd=odd+a[i];
    }
  cout<<"The sum of the even numbers in the array is "<<even<<"\n"<<"The sum of the odd numbers in the array is "<<odd;
}
  
