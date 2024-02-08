public class Main {
    static int[][] available_notes = {{2000, 500, 200, 100}, 
                                       {10, 10, 10, 4}};
    static int[] withdrawn_notes = {0, 0, 0, 0};

    public static void main(String[] args) {
        withdraw(0, 8000, 0);
        for (int i = 0; i < 4; i++)
            System.out.println(withdrawn_notes[i] + " ");
    }

    static void withdraw(int n, int amount, int flag) {
        int sum = 0, quotient, remainder;

        if (n == 4 && flag == 0) {
            withdraw(0, amount, 1);
            return;
        }

        else if (n == 4 && flag == 1)
            return;

        if (flag == 0) {
            for (int i = n; i < 4; i++)
                if (available_notes[1][i] > 0)
                    sum += available_notes[0][i];
        }
        else
            sum = available_notes[0][n];

        quotient = amount / sum;
        remainder = amount;
        if (available_notes[1][n] >= quotient) {
            withdrawn_notes[n] += quotient;
            available_notes[1][n] -= quotient;
            remainder = amount - available_notes[0][n] * quotient;
        }
        if (remainder <= 0)
            return;
        else
            withdraw(n + 1, remainder, flag);
    }
}