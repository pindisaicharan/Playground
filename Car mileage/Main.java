#include<iostream>
using namespace std;
int main()
{
  int m,l,d;
  cin>>m>>l>>d;
  if(m*l<d)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}