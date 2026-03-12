import java.util.Scanner;

public class cost_of_balloons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();

            int n = sc.nextInt();

            int count1 = 0;
            int count2 = 0;

            for (int i = 0; i < n; i++) {
                int p1 = sc.nextInt();
                int p2 = sc.nextInt();

                if (p1 == 1) count1++;
                if (p2 == 1) count2++;
            }

            int cost1 = count1 * c1 + count2 * c2;
            int cost2 = count1 * c2 + count2 * c1;

            System.out.println(Math.min(cost1, cost2));
        }
    }
}

