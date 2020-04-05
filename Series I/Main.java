#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,c=0;
  float x=0.5;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i==1)
      std::cout<<0.5<<" ";
    else
    {
      x=x+pow(3,c);
      c=c+1;
      std::cout<<x<<" ";
    }
  }
}