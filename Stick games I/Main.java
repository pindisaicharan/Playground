#include<iostream>
using namespace std;
int main()
{
  int n,m,n1=0,n2=0;
  cin>>n>>m;
  while(n && m)
  {
    n1++;
    n--;
    m--;
      if(n==0||m==0)
        break;
    else
      n2++;
    n--;
    m--;
    if(n==0||m==0)
      break;
  }
  if(n2>=n1)
  {
    cout<<"Mani Iyer";
  }
  else
  {
    cout<<"Arun Gupta";
  }
    
    
}