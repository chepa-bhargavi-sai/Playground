#include<iostream>
using namespace std;
int main()
{
  int n,r,rem=0,t;
  std::cin>>n;
  t=n;
  while(n>0)
  {
    r=n%10;
    rem=rem+r;
    n=n/10;
  }
  if(t%rem==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";//Type your code here.
}