package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class Main {

    public static void main(String[] args) {

        String[] words = {"apple", "banana", "car"};
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String selectedword = words[random.nextInt(words.length)];
        char[] playerGusses = new char[selectedword.length()];
        Arrays.fill(playerGusses, '-');
        System.out.println(playerGusses);
        System.out.println(selectedword);
        int totalTimes = selectedword.length() + 2;
        int tryTimes = 0;
        boolean gameOver = false;


        while (!gameOver){
            System.out.println(playerGusses);
            char input = ' ';
            if (input == ' ') {
                input = sc.next().charAt(0);
            }
            tryTimes++;
            for(int i=0; i<selectedword.length(); i++){
                if(selectedword.toCharArray()[i] == input){
                    playerGusses[i] = input;
                }
            }
            //System.out.println( new String(playerGusses).indexOf('-'));

            if (tryTimes == totalTimes || new String(playerGusses).indexOf('-') == -1 ){
                gameOver = true;
            }
            System.out.println("End game");
        }
    }
}
