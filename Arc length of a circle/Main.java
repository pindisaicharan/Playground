#include<stdio.h>
#define PI 3.14
int main()
{
  float r,n;
   scanf("%f %f",&r,&n);
   float x=r*n*PI/180.f;
  printf("%.2f",x);
}