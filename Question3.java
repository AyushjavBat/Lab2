package Lab2;

import java.util.Scanner;

public class Question3 {

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);

        System.out.println("Enter an odd words ? ");
        String str = input.next();

        System.out.print(str + " is middle \n char = " + str.substring((str.length()/2), (str.length()/2+1)));
    }
}
