#include <iostream>
using namespace std;

int main() 
{
  int n,k=1,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
if(i%2!=0)
{
  for(j=1;j<i;j++)
  {
    printf("%d*",k);
    k++;
  }
  printf("%d",k);
  printf("\n");
  
}
 else
    {
      k=k+i;
for(j=1;j<i;j++)
{
  printf("%d*",k);
  k--;
}
printf("%d",k);
      printf("\n");
      k=k+i;
    }
  }
}