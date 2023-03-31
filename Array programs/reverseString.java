

class reverseString{

public static void main(String[] args){

String a="pavan";

String str="";

for(int i=a.length()-1;i>=0;i--){

str=str+a.charAt(i);
}
System.out.println(str);
}
}

