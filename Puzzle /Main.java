#include<iostream>
using namespace std;
int main()
{
   int r,c;
  cin>>r>>c;
  int arr[r][c];
  int arr1[c][r];
  for(int i=0;i<r;i++)
  {
for(int j=0;j<c;j++)
{
  cin>>arr[i][j];
}
}

    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr1[j][i]=arr[i][j];
      }
    }
    for(int i=0;i<c;i++)
    {
       for(int j=0;j<r;j++)
       {
         cout<<arr1[i][j]<<" ";
       }
       cout<<"\n";
    }
  
}
        