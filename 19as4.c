#include<stdio.h>
main()
{
	int i,j ,k,z=65;
	for(i=65;i<=68;i++)
	{
	for(j=68;j>=i;j--)
	{
		printf(" ");
	}
	for(k=65;k<=i;k++)
	{
		printf("%c ",z);
	
		
	}
		z+=2;
	printf("\n");
}
}
