#include<iostream>
using namespace std;
int main()
{
  int x,y,z,i,t;
  cin>>x>>y>>z;
  float r,t1,t2,t3,r1 ;
 i= (x*z*y)/100;
 t=i+x;
 r=int(0.02*i*100+0.5);
r1=(float)r/100; 
  t1=t-r1;
  t2=int(t1*100+0.5);
  t3=(float)t2/100;
  cout<<i<<"\n"<<t<<"\n"<<r1<<"\n"<<t3;
  
  
}