#include<iostream>
#include<cstring>
#include <bits/stdc++.h>
using namespace std;
int main()
{
    string str1,str2;
    cin>>str1>>str2;
    reverse(str1.begin(), str1.end()); 
    if(str1.compare(str2))
    cout<<"It is wrong";
    else
    cout<<"It is correct";
}