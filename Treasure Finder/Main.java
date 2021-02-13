#include<iostream>
using namespace std;
int main()
{
  int n1,n2,n3,n=0;
  cin>>n1;
  cin>>n2;
  cin>>n3;
   for(int i=1;i<=n1&&i<=n2&&i<=n3;i++)
    {
        if((n1%i==0)&&(n2%i==0)&&(n3%i==0))
        {
            n=i;
        }
    }
   // printf("%d\t",n);
  if((n1>n2 && n1<n3)||(n1<n2 && n1>n3))
    cout<<"The treasure is in box which has number "<<n1<<"\n"<<"The code to open the box is "<<n;
 else if((n2>n1 && n2<n3)||(n2<n1 && n2>n3))
    cout<<"The treasure is in box which has number "<<n2<<"\n"<<"The code to open the box is "<<n;
   else if((n3>n2 && n3<n1)||(n3<n2 && n3>n1))
    cout<<"The treasure is in box which has number "<<n3<<"\n"<<"The code to open the box is "<<n;
  
}