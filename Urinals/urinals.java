package Urinals;

public class urinals {
    public static void main(String[] args){
        System.out.println("Author - Rahul Ghanghas");
        boolean validString = goodString("10001");
        System.out.println(validString);
    }
    public static boolean goodString(String str){
        return str.matches("^[01]+$");
    }
}
