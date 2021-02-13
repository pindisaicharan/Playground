#include<stdio.h>
#include<string.h>
struct antha
{
  char str[20];
  int x;
};
int main()
{
      struct antha arr[1000];
      for(int i=0;;i++)
      {
      fgets (arr[i].str, sizeof (arr[i].str), stdin);
      arr[i].x = strlen (arr[i].str) - 2;
      if(i!=0&&(arr[i-1].str[arr[i-1].x]==arr[i].str[0]))
      {
          printf("%s",arr[i].str);
         continue;
      }
    else if(i==0)
    {
        printf("%s",arr[i].str);
         continue;
    }
    else
    {
    break;
    }
    
      }
    
}
