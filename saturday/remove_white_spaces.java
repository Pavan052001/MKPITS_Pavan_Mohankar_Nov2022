// different way to remove white space


import java.util.*;

class remove_white_spaces{

public static void main(String[] args){

String s="ready to fight";

String d="";

for(int i=0;i<s.length();i++){

char c=s.charAt(i);

if(!Character.isWhitespace(c)){


  d=d+c;

  }


}
System.out.println(d);


}



}
