

class finding_duplicate_String_element_from_array{

public static void main(String[] arg){

String arr[]={"khushal","omkar","sachin","vishal","omkar"};



for(int i=0;i<arr.length;i++){

for(int j=i+1;j<arr.length;j++){

if(arr[i]==arr[j]){
count=arr[i]+count;
System.out.println("Duplicate string is :"+arr[i]);

}



}

}


}



}