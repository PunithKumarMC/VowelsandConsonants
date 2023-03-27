import java.util.Scanner;

//Write a Java Program to Count Vowels and Consonants in a String.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to count the Vowels and Consonants");
        String sen = scanner.nextLine();
        String[] sent=sen.split(" ");
        int vowels=0,consonants=0;
        for (String a:sent){
            for (int i=0;i<a.length();i++){
                if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||
                        a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U'){
                    vowels++;
                }
                else{
                    consonants++;
                }
            }
        }
        System.out.println("Number of Vowels :"+vowels);
        System.out.println("Number of Consonants :"+consonants);
    }
}