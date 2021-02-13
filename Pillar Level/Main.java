#include<stdio.h>
int main()
{
    int n,h1,h2,count=0;
    scanf("%d",&n);
    int str[n];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&str[i]);
    }
    scanf("%d %d",&h1,&h2);
    for(int i=0;i<n;i++)
    {
        if(h1%str[i]==0 && h2%str[i]==0)
        count++;
    }
    printf("%d",count);
    count=0;
}