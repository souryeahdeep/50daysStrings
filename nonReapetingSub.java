import java.util.Scanner;

public class nonReapetingSub {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.next(); int res=0;
        for (int i = 0; i < str.length(); i++) {
            boolean visited[]=new boolean[256];
            for (int j = i; j < str.length(); j++) {
                if(visited[str.charAt(j)]){
                    break;
                }
                else{
                    res = Math.max(res, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
        }
        System.out.println(res);

    }

}
