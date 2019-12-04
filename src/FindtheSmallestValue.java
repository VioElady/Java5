import java.util.Scanner;

public class FindtheSmallestValue {
    public static void main(String[] args) {
        int n;
        int numbers;
        int min = Integer.MAX_VALUE;
        System.out.println("The number of values:" );

        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        System.out.println("Enter numbers:" );


        for (int i = 0; i < n; i++){
            numbers = input.nextInt();
            if (numbers < min){
                min = numbers;
            }
        }

        System.out.println("The smallest number is " + min);
    }
}