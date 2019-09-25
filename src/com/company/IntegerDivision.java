package com.company;

import java.util.Scanner;

public class IntegerDivision {

    public static void main(String[] args) {

        int firstNumber;
        int dividedBy;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What number are you dividing? (Must be a whole number)");
        firstNumber = in.nextInt();
        in = new Scanner(System.in);
        System.out.println("Divide " + firstNumber + " by?");
        dividedBy = in.nextInt();

        System.out.println(firstNumber + " / " + dividedBy + " = " + ((firstNumber / dividedBy) + 1));

    }
}
