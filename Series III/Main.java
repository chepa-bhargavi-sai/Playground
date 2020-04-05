#include<iostream>
using namespace std;
int main()
{
  int n,x=6,d=1;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i==1)
      std::cout<<6<<" ";
    else
    {
      x=x+(5*(i-1));
      std::cout<<x<<" ";
    }
  }
}