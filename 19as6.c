#include<stdio.h>
main()
{
	int i,j ,k,a=1;
	for(i=0;i<=4;i++)
	{
	for(j=4-1;j>=i;j--)
	{
		printf(" ");
	}
	for(k=0;k<a;k++)
	{
		printf("%c",k+65);
	
		
	}
		a+=2;
	printf("\n");
}
}
