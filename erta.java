import java.util.*;
public class erta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "";
        System.out.println("Enter a string");
        String str = sc.next();
        st = st + str.charAt(0);
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            for (int j = 0; j < st.length(); j++) {
                if (ch == st.charAt(j)) {
                    c=1;
                }
            }
           if(c==0)
               st+=ch;

           c=0;
        }
        System.out.println("The new str = " + st);

    }
}
