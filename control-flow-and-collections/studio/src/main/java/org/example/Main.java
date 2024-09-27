package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a phrase.");
        String value = input.nextLine();
        String updatedValue = value.replaceAll("[^a-zA-Z]", "");
        //String value = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = updatedValue.toUpperCase().toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();
        for (char letter : charactersInString) {
            if(charCount.containsKey(letter)){
                int currentCount = charCount.get(letter);
                charCount.put(letter, currentCount+1);
            }else{
                charCount.put(letter,1);
            }
        }
        for(Map.Entry<Character,Integer> count: charCount.entrySet()){
            System.out.println(count.getKey() + ": " + count.getValue());
        }
    }
}