#include<stdio.h>
#include<math.h>
int iskaprekarno();
int main()
{
    int n;
    scanf("%d",&n);
    int x=iskaprekarno(n);
    if(x)
    {
        printf("Kaprekar Number");
    }
    else
    printf("Not a Kaprekar Number");
}
int iskaprekarno(int n)
{
    int count=0;
    int squaren=n*n;
    
    while(squaren)
    {
        count++;
        squaren=squaren/10;
    }
    squaren=n*n;
   
    for(int j=1;j<count;j++)
    {
        int fact=pow(10,j);
        if(fact==n)
      continue;
        int part1=squaren%fact;
        int part2=squaren/fact;
        int sum=part1+part2;
        if(sum==n)
        return 1;
    }
  return 0;
}