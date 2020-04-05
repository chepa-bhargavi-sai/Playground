#include<iostream>
using namespace std;
int main()
{
  int i,j,t,x=1;
  std::cin>>i>>j;
  t=i+j;
  for(int k=2;k*k<=t;k++)
  {
    if(t%k==0)
    {
      if(k*k!=t)
        x = x + k + t/k;
      else
        x=x+k;
    }
  }
  if (x == t && t != 1)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}
