#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int a,b,c,d;
  std::cin>>a>>b>>c;
  d=pow(a,b);
  if(c>d)
    std::cout<<"Sorry Doctor! You need more bacteria.";
  else
    std::cout<<"Doctor, you can proceed with your experiment.";
}
  