#include<iostream>
#include<cmath>
int main()
{
  int m,n,req,i=1,j=1;
  std::cin>>m>>n>>req;
  while(j<=n)
  {
    i=m*i;
    j++;
  }
 if(req<=i)
   printf("Doctor, you can proceed with your experiment.");
  else
    printf("Sorry Doctor! You need more bacteria.");
  
}
  
