

class upperlower{

public static void main(String[] args){

String s ="ankita";
/*
String str;
for(int i=1;i<s.length/2;i++){

	str=i.UpperCase();

	}
	System.out.println(str);
*/

//int d=s.length()/2;

String s1=s.substring(0,3);

String s2=s.substring(3);


String s3=s1.toUpperCase();

String s4=s2.toLowerCase();

System.out.println(s3);

System.out.println(s4);



}

}