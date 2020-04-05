#include<iostream>
int main()
{
  int n,a=0,b=1,c;
  std::cin>>n;
  for(int i=2;i<n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<c;//Type your code here.
}