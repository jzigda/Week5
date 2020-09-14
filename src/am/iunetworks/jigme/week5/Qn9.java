package am.iunetworks.jigme;

import java.util.Scanner;

public class Qn9{
    public static void main(String args[]){
        int i, j, row;
        System.out.print("Enter the number of rows you want to print: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
         for (i=0; i<row; i++){
              for (j=row-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for (j=0; j<=i; j++ )
            {
                   System.out.print("* ");
            }
            System.out.println();
        }
    }
}