//Write a program to sort a string in alphabetical order.

import java.util.*;
public class sortString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        str=str+" ";
        String st="";
        String sorted="";

        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
              st=st+ch;

            }
            else{
                for (char c='a';c<='z';c++){
                    for(int j=0;j<st.length();j++){
                        if(c==st.charAt(j)){
                            sorted=sorted+c;
                        }
                        else if (c==Character.toLowerCase(st.charAt(j))){
                            sorted=sorted+Character.toUpperCase(st.charAt(j));
                        }

                        else {
                            continue;
                        }
                    }
                }
                st="";
                sorted+=' ';
            }
        }


        System.out.println("Sorted String : "+sorted);

    }
}
