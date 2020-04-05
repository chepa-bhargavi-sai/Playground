#include<iostream>
int main()
{
  int n1,n2,s,gcd;
  std::cin>>n1>>n2;
  if(n1<n2)
    s=n1;
  else
    s=n2;
  while(s>=1)
  {
    if(n1%s==0 and n2%s==0)
    {
      gcd=s;
      break;
    }
    s=s-1;
  }
  std::cout<<"G.C.D of "<<n1<<" and "<<n2<<" = "<<gcd;//Type your code here.
}