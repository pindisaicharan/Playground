#include<stdio.h>
#include<string.h>
#include<math.h>
int main()
{
  int count=0;
    char str1[1000],str2[1000]={0};
    scanf("%s",str1);
    int x=strlen(str1);
    for(int i=0;i<=x;i++)
    {
      str2[str1[i]-97]++; 
    }
    for(int i=0;i<=x;i++)
    {
        if(str2[str1[i]-97]==1){
        count++;
      //printf("%c",str1[i]);
        }
    }
  printf("%d",count-1);
}