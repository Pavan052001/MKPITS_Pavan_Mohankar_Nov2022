public class count_occurence_of_char_in_string {

    public static void main(String[] args) {
        String a=" applep";

      int total_count = a.length();

       int total_count_after_remove= a.replace("p","").length();

        int count= total_count-total_count_after_remove;

        System.out.println("number of occurences of p is" +count);
    }
}
