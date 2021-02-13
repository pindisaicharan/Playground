#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  char str[100];
  cin.get(str, 100, '\n');
  int len=strlen(str);
  for(int x=len-1;x>=0;x--)
  {
      cout<<str[x];
  }
}