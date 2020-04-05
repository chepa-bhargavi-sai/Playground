#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c>>d;
  a=a+c;
  b=b+d;
  d=b/100;
  a=a+d;
  b=b%100;
  std::cout<<a<<"\n";
  std::cout<<b;
  //Type your code here.
}