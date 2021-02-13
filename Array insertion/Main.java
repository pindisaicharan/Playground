#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  int n;
  cout<<"Enter the number of elements in the array\n";
  cin>>n;
   int a[n];
  cout<<"Enter the elements in the array\n";
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  int loc,loc1;
  cout<<"Enter the location where you wish to insert an element\n";
  cin>>loc;
  if(loc>n)
  {
cout<<"Invalid Input";
  }
  else
  {
  cout<<"Enter the value to insert\n";
  cin>>loc1;
  int n1=n;
  for(n;n>=loc;n--)
  {
    a[n]=a[n-1];
  }
  a[n]=loc1;
  cout<<"Array after insertion is\n";
  for(int i=0;i<=n1;i++)
  {
cout<<a[i];
    cout<<"\n";
  }
  }
}