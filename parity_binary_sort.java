
import java.util.*;

public class parity_binary_sort {
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();

            for (int x : arr) {
                int bits = countSetBits(x);

                if (bits % 2 == 0)
                    even.add(x);
                else
                    odd.add(x);
            }

            Collections.sort(even);
            Collections.sort(odd);

            for (int x : even)
                System.out.print(x + " ");
            for (int x : odd)
                System.out.print(x + " ");
        }
    }
}

