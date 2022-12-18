#include<iostream>
#include<string.h>
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
void create_account();
void cash_widthdwal();
void cash_deposite();
void aval_balance();

using namespace std;
int i=0;
struct bank
{
	int account_number;
	char name[10];
	char type[10];
	float balance;
	int deposite;
	
	
}s[100];

    void mainscr()
{
	int choice;
	
	
	while(1)
	{
		
	
	cout<<"press 1 for account creation\n";
	
	cout<<"press 2 for cash widthdwal\n";
	cout<<"press 3 for cash deposite\n";
	cout<<"press 4 for available bal\n";
	cout<<"press 5 for exit\n";
	cout<<"press 6 for menu\n";
	cout<<"Enter your choice\n";
	cin>>choice;
	switch(choice)
	{
		case 1:
			create_account();
			break;
		case 2:
			cash_widthdwal();
		    break;
		case 3:
			cash_deposite();
			break;
		case 4:
			aval_balance();
			break;
		case 5:
			exit(0);
			break;
		case 6:
			menu();
			break;
			default:
				cout<<"invalid choice";
					
	} 
	//close switch
}//infinite loop close

}

void create_account() 
{    
   cout<<"enter account_no:\n";
   cin>>s[i].account_number;
   cout<<"account holder name:\n";
   cin>>s[i].name;
   cout<<"account type\n";
   cin>>s[i].type;
   cout<<"balance is\n";
   cin>>s[i].balance;
 
	cout<<"account created\n"+i;
	
	i++;	
}
void cash_widthdwal()
{  int j,account_number,rupees;
  cout<<"enter your account_number";
  cin>>account_number;
  cout<<"enter widthdwal money";
  cin>>rupees;
  for(int j=0;j<=i;j++)
  {
  	if(s[j].account_number==account_number)
  	{
  		s[j].balance=s[j].balance-rupees;
		  cout<<"available balance :"<<s[j].balance<<endl;
	  }
  }
    
}
void cash_deposite()
{    int j ,account_number1,rupees;
	cout<<"enter your account_number";
	cin>>account_number1 ;
	cout<<"enter deposite money";
	cin>>rupees;
	for(int j=0;j<=i;j++)
	{
		if(s[j].account_number==account_number1)
		{
		  s[j].balance=s[j].balance+rupees;
		  cout<<"available balance :"<<s[j].balance<<endl;
		}
	} //for end
}
void aval_balance()
{
	int acc_no;
	cout<<"Enter account no to check\n";
	cin>>acc_no;
	for(int j=0;j<=i;j++)
	{
		if(s[j].account_number==acc_no)
		{
			cout<<s[j].balance;
		}
	}
	cout<<" aval_balance\n";
}

void exit()
{
	cout<<"exit";
}
void menu()
{
	cout<<"menu";
}



main()
{
	char user[10]={"ram"} ,upass[10]={"ram"},userk[10],passk[10],ch;
	int c1,c2, i=0;
	
   cout<<"Enter your use id: ";
   cin>>userk;
   cout<<"Enter your password: ";
    do{
    	ch=getch();
    	passk[i]=ch;
    
    	
    	 cout<<"*";
    	 ++i;
    	
      } while(ch!='\r');
     
      
       passk[i-1]='\0';
    c1= strcmp(user,userk);
    c2=strcmp(upass,passk);
    
    if(c1==0 & c2==0)
    {
    	system("cls");
      cout<<"welcome to state bank of india\n";
      mainscr();
      
      
	}
    else
    cout<<"invalid password";
}

