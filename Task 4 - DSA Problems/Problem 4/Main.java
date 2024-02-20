import java.util.*;

class Main{
    public static void main(String[] args){
        int sum=0;
        int[] numbers = new int[101];
        for (int i = 1; i < 101; i++) {
            numbers[i] = i;
        }

        System.out.println("Enter the number you want to remove form the array 1 to 100");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();
        numbers[x] = 0;

        for (int i = 1; i < 101; i++) {
            System.out.print(numbers[i] + " ");
            sum+=numbers[i];
        }
        System.out.println("Missing number is " +  (5050 - sum));
    }
}