#include<iostream>
using namespace std;
int main()
{
  int i,j,t;
  std::cin>>i>>j;
  for(int l=i;l<=j;l++)
  {
    int x=1;
    for(int k=2;k*k<=l;k++)
    {
      if(l%k==0)
      {
        if(k*k!=l)
          x = x + k + l/k;
        else
          x=x+k;
      }
    }
    if (x == l && l != 1)
      std::cout<<l<<" ";
  }
}
