#include<iostream>
using namespace std;
int main()
{
  string str;
  cin>>str;
  int i=0;
  while(str[i]!='\0')
  {
    i++;
  }
  cout<<"The number of letters in the name is "<<i;
}