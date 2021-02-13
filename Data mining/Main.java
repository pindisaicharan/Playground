#include<stdio.h>
int
main ()
{
  int n, r, r1, sum1 = 0, sum = 0;
  scanf ("%d", &n);
  while (n)
    {
      r = n % 10;
      sum = sum + r;
      n = n / 10;
      r1 = n % 10;
      sum1 = sum1 + r1;
      n = n / 10;
    }
if(sum==sum1)
{
    printf("Yes");
}
  else
    printf("No");
    
}
