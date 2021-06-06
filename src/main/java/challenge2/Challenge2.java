package challenge2;
//AGV
//6-5-2021

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {

        Scanner inputs = new Scanner(System.in);
        System.out.println("What is the input string?");
        String response = inputs.nextLine();

        System.out.println(response + " has " + response.length() + " characters.");

    }
}
