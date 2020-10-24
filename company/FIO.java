package com.company;
public class FIO
{
    public static void main(String[] args)
    {
        String name = "Иванов Сергей Петрович";
        int spaceIndex = name.indexOf(' ');
        int spaceIndex1 = name.lastIndexOf(' ');
        System.out.println("Фамилия:\t" + name.substring(0, spaceIndex));
        System.out.println("Имя:\t" + name.substring(spaceIndex, spaceIndex1));
        System.out.println("Отчество:\t" + name.substring(spaceIndex1));
    }
}