#include<stdio.h>
int main()
{
  int n,i,x;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
if(i%2==0)
x=i*i-2;
 else
x=i*i-1;
    printf("%d ",x);
  }
}