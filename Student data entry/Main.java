#include <iostream>
#include<cstring>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
 struct student sai;
   cin.getline(sai.name,50);
  //cin>>sai.name;
  cin>>sai.roll;
  cin>>sai.marks;
  cout<<"\nStudent Details\n"<<"Name: "<<sai.name<<"\nRoll: "<<sai.roll<<"\nMarks: "<<sai.marks;
}