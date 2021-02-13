#include<iostream>
int main()
{
    int r,c,tno;
    std::cin>>r>>c>>tno;
    if((tno>r+1 && tno<=2*r)||(tno>r*r-2*r && tno<=r*r-r))
      std::cout<<"It is a mango tree";
  else
    std::cout<<"It is not a mango tree";
}