#include<iostream>
using namespace std;
int main()
{
  int n,a=0,b=1,c;
  std::cin>>n;
  if(n==1)
    std::cout<<a;
  if(n==2)
    std::cout<<b;
  while((n-2)>0)
  {
    c=a+b;
    a=b;
    b=c;
    n=n-1;
  }
  std::cout<<c;//Type your code here.
}