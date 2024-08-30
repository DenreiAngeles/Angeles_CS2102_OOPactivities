import java.util.Scanner;
public class Tempconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Celcius value: ");
        float celsius = input.nextInt();
        double fahrenheit = celsius*(1.8)+(32);
        System.out.println(String.format("%.2f Celcius", celsius) + " is " + String.format("%.2f Fahrenheit", fahrenheit));
        input.close();
    }


}
