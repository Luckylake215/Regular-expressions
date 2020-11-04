package com.company;
import java.util.Scanner;
public class FIO{
        public static void main(String[] args) {
        String FIO;
        StringBuilder Surname = new StringBuilder("Фамилия: ");
        StringBuilder Name = new StringBuilder("Имя: ");
        StringBuilder Otchestvo = new StringBuilder("Отчество: ");
            System.out.println("Введите ФИО");
        Scanner scanner = new Scanner(System.in);

            FIO = scanner.nextLine();
            FIO = FIO.trim() + " ";
        int count = 0;
        if (FIO.length() > 1) {

        for (int i = 0; i < FIO.indexOf(" "); i++, count++) {
        if ((FIO.charAt(i) >= 'а' && FIO.charAt(i) <= 'я') || (FIO.charAt(i) >= 'А' && FIO.charAt(i) <= 'Я')) {
        Surname.append(FIO.charAt(i));
        }
        else
            {
        System.out.println("Введенная строка не является ФИО");
        return;
        }
        }
        if (!(FIO.indexOf(" ") == FIO.length() - 1)) {
        for (int i = count + 1; i < FIO.indexOf(" ", count + 1); i++, count++) {
        if ((FIO.charAt(i) >= 'а' && FIO.charAt(i) <= 'я') || (FIO.charAt(i) >= 'А' && FIO.charAt(i) <= 'Я')) {
        Name.append(FIO.charAt(i));
        }
        else
            {
        System.out.println("Введенная строка не является ФИО");
        return;
        }
        }
        }
        else
            {
        System.out.println("Вы не ввели имя");
        return;
        }
            FIO = FIO.trim();
        if (!(count == FIO.length() - 1)) {
        for (int i = count + 2; i < FIO.length(); i++, count++) {
        if ((FIO.charAt(i) >= 'а' && FIO.charAt(i) <= 'я') || (FIO.charAt(i) >= 'А' && FIO.charAt(i) <= 'Я'))
        {
        Otchestvo.append(FIO.charAt(i));
        } else if (FIO.charAt(i) == ' ')
        {
        System.out.println("Введенная строка не является ФИО");
        return;
        }
        else
            {
        System.out.println("Введенная строка не является ФИО");
        return;
        }
        }
        }
        if (count + 2 == FIO.length())
        {
        System.out.println(Surname);
        System.out.println(Name);
        System.out.println(Otchestvo);
        }
        else
        {
        System.out.println("Введенная строка не является ФИО");}}}}