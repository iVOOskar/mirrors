package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static ArrayList<Integer> mirror = new ArrayList();

    public static void makeArray(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("enter your number to end enter a double digit number");
            int nextNum = input.nextInt();
            if(nextNum > 9 ){
                break;
            }else{
                mirror.add(nextNum);
            }
        }
    }

    public static void main(String[] args) {
        makeArray();
        System.out.println(mirror);
    }
}
