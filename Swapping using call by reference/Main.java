#include<iostream>
using namespace std;
int main()
{
  int a,b,v;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<endl;
  v=a;
  a=b;
  b=v;
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}