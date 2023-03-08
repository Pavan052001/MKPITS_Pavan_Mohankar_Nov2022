


  class finding_duplicate_String_element_from_array_using_flag{

  public static void main(String[] arg){

  String arr[]={"khushal","omkar","sachin","vishal","Omkar"};

  boolean flag=false;

  for(int i=0;i<arr.length;i++){

  for(int j=i+1;j<arr.length;j++){

  if(arr[i]==arr[j]){

  System.out.println("Duplicate string is :"+arr[i]);
  flag=true;

  }


  }

}


if(flag==false){
System.out.println("not duplicate value");

}
}

}