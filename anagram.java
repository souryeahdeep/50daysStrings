import java.util.Scanner;
//Anagram Words
public class anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings : ");
        String str1=sc.next();
        String str2=sc.next();
        str1= str1.toLowerCase();
        str2=str2.toLowerCase();
        String st1=sorted(str1);
        String st2=sorted(str2);

        if(st1.equals(st2)){
            System.out.println("Anagram String");
        }
        else{
            System.out.println("Not a Anagram");
        }
    }
    public static String sorted(String s){
        String sorTed="";
        for(char ch='a';ch<='z';ch++){
            for(int i=0;i<s.length();i++){
                if(ch==s.charAt(i))
                    sorTed=sorTed+ch;
            }

        }
        return sorTed;
    }
}
