#include<iostream>
using namespace std;
int main()
{
  string str;
  getline(cin,str);
  //int x=str.size();
 // printf("%d",x);
  int i, vowels, consonants, digits, spaces, symbols;
vowels = consonants = digits = spaces = symbols = 0;
for(i=0; str[i]!='\0'; ++i)
{
if(str[i]=='a' || str[i]=='e' || str[i]=='i' ||
str[i]=='o' || str[i]=='u' || str[i]=='A' ||
str[i]=='E' || str[i]=='I'|| str[i]=='O'||
str[i]=='U')
{
++vowels;
}
else if((str[i]>='a'&& str[i]<='z') || (str[i]>='A'&& str[i]<='Z'))
{
++consonants;
}
else if(str[i]>='0' && str[i]<='9')
{
++digits;
}
else if (str[i]==' ')
{
++spaces;
}
else
{
++symbols;
}
}
printf("Vowels:%d",vowels);
printf("\nConsonants:%d",consonants);
printf("\nWhite Spaces:%d", spaces);
  printf("\nDigits:%d",digits);
printf("\nSymbols:%d", symbols);
return 0;

}