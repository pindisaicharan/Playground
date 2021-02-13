#include<iostream>
int main()
{
    int u;
    std::cin>>u;
    if(u<=200)
    std::cout<<"Rs."<<int(u*0.5);
    else if(u>200 && u<=400)
    std::cout<<((u-200)*0.65)+(200*0.5)+100;
    else if(u>400 && u<=600)
    std::cout<<((u-400)*0.80)+(200*0.65)+(200*0.5)+200;
    else if(u>600)
    std::cout<<((u-600)*1.25)+(200*0.80)+(200*0.5)+425;
}