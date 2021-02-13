#include<iostream>
#include<cstring>
using namespace std;
int printresult(int a[],int cv,int nm);
int main()
{
  int nm,cv,mv,i;
  cin>>nm>>cv;
  int a[nm];
  for(i=0;i<nm;i++)
  {
cin>>a[i];
  }
printresult(a,cv,nm);
}
  int printresult(int a[],int cv,int nm)
{
  int sum=0,i;
  for(i=0;i<nm;i++)
  {
    sum=sum+a[i];
 
  }
    
  if(sum<=cv)
  {
    cout<<"YES";
  }
  else
    cout<<"NO";
}
