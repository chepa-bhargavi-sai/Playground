#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,x=11,d;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i==1)
      std::cout<<121<<" ";
    else
    {
      x=x+4;
      d=pow(x,2);
      std::cout<<d<<" ";
    }
  }
}