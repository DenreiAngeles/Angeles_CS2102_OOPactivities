import java.util.Scanner;
public class GettingGreater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Getting the Greater Value");
        System.out.print("Enter first character: ");
        char ch1 = input.next().charAt(0); 
        System.out.print("Enter second character: ");
        char ch2 = input.next().charAt(0);
        int int1 = (int) ch1;
        int int2 = (int) ch2;
        int max = Math.max(int1, int2);
        
        System.out.println("-------------------------------------------");
        System.out.println("The character with greater value is: " + (char) max);
        System.out.println("-------------------------------------------");
        System.out.println("Showing the ASCII Codes");
        System.out.println(ch1+ " : " +int1);
        System.out.println(ch2+ " : " +int2);
        input.close();
    }
}
