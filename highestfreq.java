import java.util.Scanner;

public class highestfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();

        int c = 0;
        int max = 0;
        char st = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = i; j < str.length(); j++) {
                if (ch == str.charAt(j))
                    c++;
            }
            if (c >= max) {

                st = ch;

                max = c;

            }
            c = 0;

        }
        int c1 = 0;
        for (int a = 0; a < str.length(); a++) {
            char ch = str.charAt(a);

            for (int b = a; b < str.length(); b++) {
                if (ch == str.charAt(b))
                    c1++;
            }
            
            if (c1 == max) {
                System.out.println(max + " " + ch);
            }
            c1 = 0;

        }


    }
}
