#include<iostream>
using namespace std;
int main()
{
  int currentage,currentyear;
  cin>>currentage>>currentyear;
  if(currentage>currentyear)
    cout<<100-currentage+currentyear;
  else
    cout<<currentyear-currentage;
}