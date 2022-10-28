package Urinals;

import java.io.*;
import java.util.Scanner;

public class urinals {
    public static void main(String[] args) throws IOException {
        System.out.println("Author - Rahul Ghanghas");
        System.out.println("Input string through keyboard :-");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(goodString(s));
        System.out.println(countUrinals(s));
        System.out.println("Input string through urinal.dat file :-");
        File file = new File("C:\\Users\\rghangha\\UrinalsAssignment\\urinal.dat");
        Writer wr = new FileWriter("C:\\Users\\rghangha\\UrinalsAssignment\\rule.txt");
        Scanner sc2 = new Scanner(file);
        while(sc2.hasNextLine()) {
            String line = sc2.nextLine();
            int freeUrinals = countUrinals(line);
            wr.write(freeUrinals+"\n");
        }
        wr.close();
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
