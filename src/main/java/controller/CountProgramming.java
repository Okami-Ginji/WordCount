/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import common.Library;
import java.util.LinkedHashMap;
import view.Menu;

/**
 *
 * @author ACER
 */
public class CountProgramming extends Menu<String> {
    
    static String[] mc = {"Letter Count", "Character Count", "Exit"};
    String str;
    Library l;

    public CountProgramming() {
        super("PROGRAMMING", mc);
        l = new Library();
        str = l.getString("Input string: ");
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                countLetter(str);
                break;
            case 2:
                countCharater(str);
                break;
            case 3:
                System.exit(0);
        }
    }
    
    public void countLetter(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        String[] strSplit = str.split("\\s+|\\p{Punct}");
        for (int i = 0; i < strSplit.length; i++) {
            String ch = strSplit[i];
            int count = 0;
            for (int j = 0; j < strSplit.length; j++) {
                if (strSplit[j].equals(ch)) {
                    count++;
                }
            }
            lhm.put(ch, count);
        }
        
        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
    
     public void countCharater(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
        String temp = str;
        temp = temp.replaceAll("[\\s\\p{Punct}]+", "");
        for (int i = 0; i < temp.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j < temp.length(); j++) {
                if (str.charAt(j)==ch) {
                    count++;
                }
            }
            lhm.put(ch+"", count);
        }
        
        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
