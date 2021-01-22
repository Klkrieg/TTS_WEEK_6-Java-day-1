package com.tts;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {

        /*
        * Dear name,
        You are adverb adjective and I want to be your noun! I want to go to the nounTwo with you in number days.
        Sincerely, yourName
        * */
        Scanner input = new Scanner(System.in);

        System.out.println("Hello, What's your name?");
        String firstName = input.nextLine();
        System.out.printf("Hello %s.\n", firstName);
        input.close();
    }
}
