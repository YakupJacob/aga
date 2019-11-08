package mainpac;

import java.util.Scanner;

public class jay2 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        if("zero".equalsIgnoreCase(s1)){
            System.out.println(0);
        } else if(s1.equalsIgnoreCase("one")){
            System.out.println(1);
        } else if("two".equals(s1)){
            System.out.println(2);
        }
    }
}
