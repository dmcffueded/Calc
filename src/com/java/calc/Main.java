package com.java.calc;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input0 = scanner.nextLine();

        String input1 = input0.replaceAll("VIII", "8");
        String input2 = input1.replaceAll("III", "3");
        String input3 = input2.replaceAll("VII", "7");
        String input4 = input3.replaceAll("II", "2");
        String input5 = input4.replaceAll("IV", "4");
        String input6 = input5.replaceAll("VI", "6");
        String input7 = input6.replaceAll("IX","9");
        String input8 = input7.replaceAll("I","1");
        String input9 = input8.replaceAll("X","10");
        String input = input9.replaceAll("V","5");

        Pattern pattern = Pattern.compile("(\\w+)([\\+\\-\\*\\/])(\\w+)");
        Matcher matcher = pattern.matcher(input.replace(" ", ""));

        String a = null;
        String b = null;
        String s = null;

        while (matcher.find()) {
            a = matcher.group(1);
            s = matcher.group(2);
            b = matcher.group(3);
        }

        Long a1 = Long.valueOf(a);
        Long a2 = Long.valueOf(b);

        if ((a1 < 1) | (a1 > 10) | (a2 < 1) | (a2 > 10)){
            System.out.println("Калькулятор работает только с натуральными арабскими и римскими числами " +
                    "в диапазоне от 1 до 10 включительно и операциями +, -, * и /");
            return;
        }

            if(s.equals("+")){
            System.out.println(a1+a2);
        } else if(s.equals("-")){
            System.out.println(a1-a2);
        } else if(s.equals("*")){
            System.out.println(a1*a2);
        } else if(s.equals("/")){
                System.out.println(a1/a2);
        }
        }
    }