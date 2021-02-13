#include<iostream>

using namespace std;

int main()

{

char str[200];

cin.getline(str,200);

int i=0,j=0;

while(str[i]!='\0')

{

if(str[i]=='t')

{ 

i++;
j++;

if(str[i]=='h')

{

i++;
j++;

if(str[i]=='e')

{

i++;
j++;

if(str[i]==' ')

i++;
j++;

}

}
if(j==4)
{
    
    j=0;
}

else


{ i=i-j;

cout<<str[i];
j=0;

i++;

 cout<<str[i];

 i++;

}

}

else

{ cout<<str[i];

i++;

}

}

}
