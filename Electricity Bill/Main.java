#include<iostream>
using namespace std;
int main()
{
  int n,t;
  std::cin>>n;
  if(n<=200)
  {
    t=0.5*n;
  }
  else if(n>200 and n<=400)
  {
    t=0.65*n+100;
  }
  else if(n>400 and n<=600)
  {
    t=0.80*n+200;
  }
  else
  {
    t=1.25*n+425;
  }
  std::cout<<"Rs."<<t;//Type your code here.
}