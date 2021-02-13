#include<stdio.h>
int main()
{
int n1,n2,n3,n4,n;
  scanf("%d %d %d %d",&n1,&n2,&n3,&n4);
  for(int i=1;i<=n1 && i<=n2 && i<=n3;i++)
  {
if(n1%i==0 && n2%i==0 && n3%i==0)
{
 n=i;
}
  }

  if(n4==n)
  printf("Answer is correct.");
  else
    printf("Answer is wrong.");
}