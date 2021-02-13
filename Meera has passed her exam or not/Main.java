#include<iostream>
using namespace std;
int main()
{
  int n,roll,count=0;
  cin>>n;
  int arr[n];
  for(int i=0;i<n;i++)
  {
    cin>>arr[i];
  }
  cin>>roll;
  for(int i=0;i<n;i++)
  {
    if(roll==arr[i])
      count++;
  }
  if(count!=0)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}