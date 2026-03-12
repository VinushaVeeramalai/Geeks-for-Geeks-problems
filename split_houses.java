import java.util.Scanner;

public class split_houses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String s = sc.next();

        
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'H' && s.charAt(i + 1) == 'H') {
                System.out.println("NO");
                return;
            }
        }

    
        s = s.replace('.', 'B');

        System.out.println("YES");
        System.out.println(s);
    }
}

