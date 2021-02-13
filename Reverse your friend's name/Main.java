#include<iostream>
#include<cstring>
using namespace std;
int main() 
{ 
   string str;
  getline(cin,str);
 string::reverse_iterator i;
  for(i=str.rbegin();i!=str.rend();i++)
  {
cout<<*i;
  }
}