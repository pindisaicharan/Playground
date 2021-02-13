#include<iostream>
int main()
{
    int num;
    int r,sum=0,i=0;
     scanf("%d",&num);
    while(num>=0)
    {
        r=num%10;
        if(i==0)
        sum=sum+r;
        if(i==3)
        {
        sum=sum+r;
        break;
        }
        num=num/10;
        i++;
    }
printf("%d",sum);
}