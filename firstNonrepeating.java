import java.util.Scanner;
//First non repeating element in a String
public class firstNonrepeating {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.next();
        int c=0; String ca="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(Character.toLowerCase(ch)==Character.toLowerCase(str.charAt(j)))
                    c++;
            }
            if(c==1){
                ca=ca+ch;
                break;
            }
            else{
                c=0;
            }


        }
        if(ca!="")
        System.out.println("First Non Repeating Character : "+ca);
        else
            System.out.println("every character is repeating");

    }
}
