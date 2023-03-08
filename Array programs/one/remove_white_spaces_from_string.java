public class remove_white_spaces_from_string {
    public static void main(String[] args) {

        String a=" hello my friend";

        System.out.println("before removing white spaces : "+a);

         a=a.replaceAll("\\s","");


        System.out.println("after removing white spaces : "+a);
    }
}
