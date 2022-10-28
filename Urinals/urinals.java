package Urinals;

import java.util.Scanner;

public class urinals {
    public static void main(String[] args){
        System.out.println("Author - Rahul Ghanghas");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(goodString(s));
        System.out.println(countUrinals(s));
    }
    public static int countUrinals(String str){
        if (goodString(str)) {
            return str.contains("11") ? -1 : str.replaceAll("010|10|01", "1")
                    .replace("00", "0").replace("1", "").length();
        }
        System.out.println("Input is not valid string, so Output would be -1");
        return -1;
    }
    public static boolean goodString(String str){
        return str.matches("^[01]+$");
    }
}
