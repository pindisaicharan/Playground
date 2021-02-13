#include<stdio.h>
#include<math.h>
int main()
{
    int a,b,c,num=0,largest,smallest;
    scanf("%d %d %d",&a,&b,&c);
    for(int i=0;i<4;i++)
    {
        if(i%2==0)
        {
            int x=a%10,y=b%10,z=c%10;
            int largest=((x>y)?((x>z)?x:z):((y>z)?y:z));
            num=num+(largest*pow(10,i));
            a=a/10;b=b/10;c=c/10;
        }
        else
        {
            int x=a%10,y=b%10,z=c%10;
            int smallest=((x<y)?((x<z)?x:z):((y<z)?y:z));
            num=num+(smallest*pow(10,i));
            a=a/10;b=b/10;c=c/10;
        }
    }
    printf("%d",num);
}