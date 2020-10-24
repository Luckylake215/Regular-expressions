package com.company;

public class Zarabotoc {
    public static void main(String[] args)
    {
        String text="Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int textIndex=text.indexOf(' ',text.indexOf(' ')+1)+1;
        int oneNumber=Integer.parseInt(text.substring(textIndex,text.indexOf(' ',(textIndex))));
        int threeNumber=Integer.parseInt(text.substring(text.lastIndexOf('-')+2,text.lastIndexOf(' ')));
        System.out.println("Сумма затрат: "+(oneNumber+threeNumber));
    }
}
