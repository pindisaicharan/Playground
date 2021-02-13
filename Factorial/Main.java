#include<stdio.h>>
int fact();
int main()
{
  int n;
 scanf("%d",&n);
  int f=fact(n);
  printf("The factorial of %d is %d",n,f);
}
int fact(int n)
{
if(n==1)
  return 1;
  else
    return n*fact(n-1);
}