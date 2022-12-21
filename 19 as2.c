#include<stdio.h>
main()
{
	int i,j ,k,z=1;
	for(i=1;i<=4;i++)
	{
	for(j=4;j>=i;j--)
	{
		printf(" ");
	}
	for(k=1;k<=i;k++)
	{
		printf("%d ",z);
	
		
	}
		z+=2;
	printf("\n");
}
}
