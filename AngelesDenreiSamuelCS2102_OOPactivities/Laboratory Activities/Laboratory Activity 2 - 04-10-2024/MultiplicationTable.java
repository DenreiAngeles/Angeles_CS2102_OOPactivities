import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();
        int [][] arr = new int[size][size];

        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (i+1)*(j+1);
                int number = arr[i][j];
                System.out.printf("%4d", number);
            }
            System.out.println();
        }
        input.close();
    }
}
