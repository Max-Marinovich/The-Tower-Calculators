package Reusable;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        String s1, s2, s3, s4;
        System.out.println("s1");
        s1 = scan.nextLine();
        System.out.println("s2");
        s2 = scan.nextLine();
        System.out.println("s3");
        s3 = scan.nextLine();
        System.out.println("s4");
        s4 = scan.nextLine();


        String c1, c2, c3, c4;
        System.out.println("c1");
        c1 = scan.nextLine();
        System.out.println("c2");
        c2 = scan.nextLine();
        System.out.println("c3");
        c3 = scan.nextLine();
        System.out.println("c4");
        c4 = scan.nextLine();

        PrintDataTable.printDT(s1,s2,s3,s4,c1,c2,c3,c4);


    }
}
