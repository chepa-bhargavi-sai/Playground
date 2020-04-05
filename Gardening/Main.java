#include<iostream>
using namespace std;
int main()
{
  int a,b,n,d,e,f,g;
  std::cin>>a>>b>>n;
  d=a+1;//11
  e=2*a;//20
  f=a*b-a;//90
  g=f-a;//80
  //std::cout<<d<<e<<f<<g<<n;
  if(((n>=d) and (n<=e)) or ((n>g) and (n<=f)))
  {
    std::cout<<"It is a mango tree";
  }
  else
  {
    std::cout<<"It is not a mango tree";
  }//Type your code here.
}