package Urinals;

public class urinals {
    public static void main(String[] args){
        System.out.println("Author - Rahul Ghanghas");
        boolean validString = goodString("10001");
        System.out.println(validString);
        int freeUrinals = countUrinals("10001");
        System.out.println(freeUrinals);
    }
    public static int countUrinals(String str){
        return str.contains("11") ? -1 : str.replaceAll("010|10|01","1")
                .replace("00","0").replace("1","").length();
    }
    public static boolean goodString(String str){
        return str.matches("^[01]+$");
    }
}
