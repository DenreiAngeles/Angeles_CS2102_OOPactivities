import java.util.Scanner;
public class GetArrayMean {
    public static float getArrayMean(int[] arr) {
        int sum = 0;
        for(int idx = 0; idx < arr.length; idx++) {
            sum += arr[idx];
        }
        float mean = (float) sum/arr.length;
        return mean;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            System.out.print("Enter Number: ");
            arr[i] = input.nextInt();
        }
        float mean = getArrayMean(arr);
        System.out.println("Mean of array is: mean: " + String.format("%.2f", mean));
        input.close();
    }
}
