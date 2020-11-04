package com.company;
import java.util.Scanner;

public class Number{
    public static void main(String[] args) {

        String phone;

        StringBuffer result = new StringBuffer();

        Scanner scanner = new Scanner(System.in);

        phone = scanner.nextLine();

        phone = phone.replaceAll("[^0-9]", "");

        if (!(phone.length() > 11 || phone.length() < 10)) {
            if (phone.charAt(0) == '7' && phone.length() == 11) {
                result.append(phone);
                result.insert(0, "+");
                result.insert(2, " (");
                result.insert(7, ") ");
                result.insert(12, "-");
                result.insert(15, "-");
                System.out.println(result + " Символ 11 в номере, код страны 7 - номер верный.");
                result.delete(0, result.length());

            } else if (phone.charAt(0) == '8' && phone.length() == 11) {
                result.append(phone);
                result.delete(0, 1);
                result.insert(0, "+7");
                result.insert(2, " (");
                result.insert(7, ") ");
                result.insert(12, "-");
                result.insert(15, "-");
                System.out.println(result + " Символов 11 в номере, первый символ 8 (код выхода на мобильный номер) заменяем на код страны 7 - номер верный.");
                result.delete(0, result.length());
            }
            else if (phone.length() == 10) {
                result.append(phone);
                result.insert(0, "+7");
                result.insert(2, " (");
                result.insert(7, ") ");
                result.insert(12, "-");
                result.insert(15, "-");
                System.out.println(result + " Количество символов 10 после очистки - значит, приводим к формату номера с 7.");
                result.delete(0, result.length());
            }
            else if (phone.charAt(0) == '9' && phone.length() == 11)
            {
                System.out.println(" Неверный формат номера"+" Символов 11 в номере, первый символ после очистки 9, это не и не 8 - формат номера неверный.");
            }
        }
        else if(phone.length()>11)
        {
            System.out.println(" Неверный формат номера"+" Символов в номере больше чем 11 - номер неверный.");
        }
        else if(phone.length()==7)
        {
            System.out.println(" Неверный формат номера"+" Символов 7 в номере - номер неверный.");
        }
    }
}
