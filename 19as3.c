#include<stdio.h>
main()
{
	int i,j ,k ,a=65;
	for(i=65;i<=69;i++)
	{
	for(j=69;j>i;j--)
	{
		printf(" ");
	}
	for(k=65;k<=i;k++)
	{
		printf("%c ",a);
		
	}
	printf("\n");
	a++;
}
}
