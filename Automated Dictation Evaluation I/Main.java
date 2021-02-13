#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  string str1;
  string str2;
  cin>>str1>>str2;
 int x= str1.compare(str2);
  if(x)
    cout<<"It is wrong";
  else
    cout<<"It is correct";
}