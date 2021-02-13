#include<iostream>
using namespace std;
int main()
{
  int age;
  float t;
  cin>>age>>t;
  float p;
  if(age>13)
  {
if(t==13.30f)
p=5.00;
 else
 p=8.00;
  }
  else if(age<13)
  {
    if(t==13.30f)
      p=2.00;
    else
      p=4.00;
  }
  printf("$%.2f",p);
}