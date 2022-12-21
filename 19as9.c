main()
{
	int i,j ,k,z=1;
	for(i=1;i<=4;i++)
	{
	for(j=4-1;j>=i;j--)
	{
		printf(" ");
	}
	for(k=1;k<=z;k++)
	{
		printf("%d ",abs(k-i));
	
		
	}
		z+=2;
	printf("\n");
}
}
