#include<stdio.h>
#include<string.h>
#include<math.h>
int main()
{
    int a,r,count=0,num=1;
    scanf("%d",&a);
    //scanf("%d",&b)
    while(a)
    {
        r=a%10;
        num=num*r;
        a=a/10;
    }
    printf("%d",num);
    
}