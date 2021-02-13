#include<stdio.h>
#include<string.h>
int main()
{
    char str1[1000];
    int i,count=0;
    scanf("%s",str1);
    int x=strlen(str1)-1;
    int y=x;
    char str2[1000];
    for( i=0;i<=x;i++)
    {
        str2[i]=str1[y--];
    }
    str2[i]=0;
   
    for(int j=0;j<=x;j++)
    {
        if(str2[j]==str1[j])
            count++;
       else
       continue;
    }
  printf("%d",count);
}