#include<iostream>
using namespace std;
int main()
{
  int p,r,t;
  float i,a,d,f;
  std::cin>>p>>r>>t;
  i=float((p*t*r)/100);
  a=float(p+i);
  d=float(0.02*i);
  f=float(a-d);
  //printf("%.2f\n%.2f\n%.2f\n%.2f",i,a,d,f);
  std::cout<<i<<"\n"<<a<<"\n"<<d<<"\n"<<f;//Type your code here.
}