#include<iostream>
using namespace std;
int main()
{
  int tn,tr,ir,in,o1,rra,trra,o0;
  float o,o2,rra1,trra1;
  std::cin>>tn>>tr>>ir>>in;
  o0=in%6;
  o=float(o0)/10;
  o1=in/6;
  o2=o+o1;
  rra=(ir/float(o2)+0.05)*10;
  rra1=float(rra)/10;
  trra=(float(tr)/50+0.05)*10;
  trra1=float(trra)/10;
 std::cout<<tn/6<<"\n"<<o2<<"\n"<<rra1<<"\n"<<trra1<<"\n";
  if(trra1>rra1)
    std::cout<<"Not Eligible to Win";
  else
    std::cout<<"Eligible to Win";
}