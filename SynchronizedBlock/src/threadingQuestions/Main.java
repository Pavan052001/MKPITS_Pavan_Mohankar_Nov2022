package threadingQuestions;

public class Main {
    public static void main(String[] args) {

        PrintName printName = new PrintName();
        ThreadOne threadOne = new ThreadOne(printName);
        threadOne.start();
    }
}
