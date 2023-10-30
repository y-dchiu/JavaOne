package com.xpanxion.assignments.student.JavaOne;
import java.util.*;
public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        System.out.println("Student 1: ex1.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Your name in upper case is: "+name.toUpperCase());
        input.close();
    }

    public void ex2() {
        System.out.println("Student 1: ex2.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();
        int upperCase = 0;
        for (int i = 0; i<text.length();i++)
            if (Character.isUpperCase(text.charAt(i))) upperCase++;
        System.out.println("Number of uppercase letters: "+upperCase+".");
    }

    public void ex3() {
        System.out.println("Student 1: ex3.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        input.close();
        int spaceCount = 0;
        for (int i=0;i<text.length();i++) {
            if (Character.isSpaceChar(text.charAt(i))) spaceCount++;
        }
        String[] str = text.split(" ",spaceCount+1);
        for(int i=0;i<=spaceCount;i++) {
            if (i % 2 == 0) {
                str[i] = str[i].toUpperCase();
            }
            System.out.print(str[i]+" ");
        }
    }

    public void ex4() {
        System.out.println("Student 1: ex4.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = input.nextLine();
        input.close();
        int right = text.length() - 1;
        for (int left = 0; left < (text.length()) / 2; left++) {
            if (text.charAt(right) != text.charAt(left)) {
                System.out.println("NO");
            }
            right--;
        }
        System.out.println("YES");
    }

    public void ex5() {
        System.out.println("Student 1: ex5.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        boolean exit = false;
        int vowel = 0;
        int consonant = 0;

        do {
            System.out.print("Enter string: ");
            String text = input.nextLine();
            text = text.toLowerCase();
            if (text.equals("quit")) {
                exit = true;
            }
            if (exit) {
                break;
            }
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'a' | text.charAt(i) == 'e' | text.charAt(i) == 'i' | text.charAt(i) == 'o' | text.charAt(i) == 'u') {
                    vowel++;
                } else if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                    consonant++;
                }
            }
            System.out.println("Number of vowels: " + vowel);
            System.out.println("Number of consonants: " + consonant);
            vowel = 0;
            consonant = 0;
        } while(!exit);
        input.close();
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        System.out.println("Result: "+sum);
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = input.nextInt();
        input.nextLine();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = input.nextLine();
        switch (operation) {
            case "add":
                add(num1, num2);
                break;
            case "sub":
                sub(num1,num2);
                break;
            case "mul":
                mul(num1, num2);
                break;
            case "div":
                div(num1, num2);
                break;
            default:
                System.out.println("Input Invalid");
        }
    }
        private void add(int num1, int num2){
            int sum = num1 + num2;
            System.out.println("Result: "+sum);
        }

        private void sub(int num1, int num2){
            int result = num1 - num2;
            System.out.println("Result: "+result);
        }

        private void mul(int num1, int num2){
            int result = num1*num2;
            System.out.println("Result: "+result);
        }

        private void div(int num1, int num2){
            int result = num1/num2;
            System.out.println("Result: "+result);
        }


    public void ex8() {
        System.out.println("Student 1: ex8.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double price = input.nextDouble();
        input.nextLine();
        boolean exit = false;
        String[] arr;
        double cost=0;

        while (!exit) {
            System.out.print("Enter room dimensions (width x height): ");
            String dimension = input.nextLine();
            if (dimension.equals("done")){
                exit = true;
                break;
            }
            arr = dimension.split(" x ");
            int[] measurements = new int[arr.length];
            measurements[0] = Integer.parseInt(arr[0]);
            measurements[1] = Integer.parseInt(arr[1]);

            cost += measurements[0]*measurements[1]*price;
        }

        System.out.println("Total cost: $"+cost);


    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
        int[] numbers = {1,2,3,4,5};
        int random = (int) (Math.floor(Math.random()*5));
        int number = numbers[random];
        boolean exit = false;

        while(!exit) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int guess = input.nextInt();
            if (guess == number) {
                System.out.println("You guessed it!!!");
                exit = true;
                break;
            } else {
                System.out.println("Try again...");
            }
        }
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String[] words = text.split("\\s+");
        int spaces = 0;
            for (String word : words) {
                    spaces = 0;
             for (char letter : word.toCharArray()) {
                for (int i = 0; i < spaces; i++) {
                    System.out.print(" ");
                }

                System.out.println(letter);

                spaces++;

            }
            System.out.println();
        }
    }

    //
    // Private helper methods
    //
}
