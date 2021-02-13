#include<iostream>
int main()
{
    int n,x=1,i,j,k,n1,y;
    scanf("%d",&n);
    n1=n*n+1;
    for(i=0;i<n;i++)
    {
        for(j=0;j<i;j++)
        {
            printf("--");
        }
        for(k=i;k<n;k++)
        {
            printf("%d*",x);
            x++;
        }
        for(y=i;y<n;y++)
        {
            if(y<n-1)
            printf("%d*",n1);
            else
            printf("%d",n1);
            n1++;
            
        }
        printf("\n");
        n1=n1-(2*n-(2*i+1));
    
    }
}