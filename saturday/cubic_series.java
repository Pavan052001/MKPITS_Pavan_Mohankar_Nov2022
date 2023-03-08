
//Cube series
//        1 8  27 64 125 216  … … … ..n

public class cubic_series {
    static void printCubes(int a, int b)
    {

        for (int i = a; i <= b; i++) {

            for (int j = 1; j * j * j <= i; j++) {
                if (j * j * j == i) {
                    System.out.print(j * j * j + "  ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int a = 1, b = 100;
        System.out.println("Perfect cubes in given range:");
        printCubes(a, b);
    }
}
