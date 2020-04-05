#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  for(int i=1;i<=4;i++)
  {
    for(int j=1;j<i+1;j++)
    {
      std::cout<<n;
    }
    n=n+1;
    std::cout<<"\n";
  }
      n=n-1;
  for(int i=4;i>=1;i--)
  {
    for(int j=i+1;j>1;j--)
    {
      std::cout<<n;
    }
    n=n-1;
    std::cout<<"\n";
  }
}
  