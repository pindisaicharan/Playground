#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string str;
  cin>>str;
  int x=str.size();
  for(int i=0;i<=x;i++)
  {
  if((str[i]>=65 && str[i]<=90)||(str[i]>=97 && str[i]<=122))
  {
    cout<<str[i];
  }
  }
  

}