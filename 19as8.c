#include<stdio.h>
main()
{
	int i,j ,k,a=65;
	for(i=65;i<=69;i++)
	{
	for(j=69-1;j>=i;j--)
	{
		printf(" ");
	}
	for(k=a;k>=i;k--)
	{
		printf("%c ",a);	
	}
		a+=2;
	printf("\n");
}
}
