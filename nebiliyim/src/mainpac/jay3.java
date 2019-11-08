package mainpac;

import java.util.Scanner;

public class jay3 {
    public static void main(String[] args){
        System.out.println("Provide a grade");
        Scanner w1 = new Scanner(System.in);
        String grade = w1.nextLine();

        if (grade.equals("A")) {
            System.out.println("Ex");

        }else if ("B-".equals(grade) || "B".equals(grade) || "B+".equals(grade)){
            System.out.println("Good");
        } else if ("C-".equals(grade) || "C".equals(grade) || "C+".equals(grade)){
            System.out.println("middle");
        }
    }
}
