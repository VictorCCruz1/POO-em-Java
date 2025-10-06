package Package;

import java.util.Scanner;

public class Scan{
    static Scanner scan = new Scanner(System.in);

    public static String   texto(){
        return scan.nextLine();
    }
    public static double   flutuante(){
        return scan.nextDouble();
    }
    public static int      inteiro(){
        return scan.nextInt();
    }
}
