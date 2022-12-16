#include<iostream>
using namespace std;

class constructor
{
	public:
		int a,b,sum;
		
		constructor()
		{
		
		a=10;
		b=20;
		sum=a*b;
	}
};

int main()
{
	constructor c;
	
	cout<<"a= "<<c.a<<endl;
	cout<<"b= "<<c.b<<endl;
	cout<<"sum"<<c.sum<<endl;
	
	
}
