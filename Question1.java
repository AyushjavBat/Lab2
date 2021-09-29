package Lab2;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name please?");
        String fname = input.next();

        System.out.println("Enter middle name please?");
        String mname = input.next();

        System.out.println("Enter last name please?");
        String lname = input.next();

        System.out.println(fname + " " + mname.charAt(0)+"." +lname );
    }
}