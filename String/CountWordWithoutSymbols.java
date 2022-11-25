package String;

import java.util.Scanner;

public class CountWordWithoutSymbols {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = "He is the boy ,isen't he?";
        String[] str = s.split("[, ?']+");
        
        System.out.println(str.length);
        for(int i=0;i<str.length;i++)
        {
        	System.out.println(str[i]);
        }
        scan.close();
    }

}

