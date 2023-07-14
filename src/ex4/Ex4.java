package ex4;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args ) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num=in.nextInt();
        for(int i=1;i<=num;i++){ 
            for(int j=num;j>=1;j--){
                if(i>=j){
                     System.out.print(" *nnn");
                }
                else{
                     System.out.print(" ");
                }
            }
             System.out.print("\n");
        }
        for(int i=1;i<=num;i++){
            for(int j=num;j>=1;j--){
                if(i>=j){
                     System.out.print("*");
                }
                else{
                     System.out.print(" ");
                }
            }
             System.out.print("\n");
        }
        System.out.print("\n");
         for(int i=1;i<=num;i++){
            for(int j=1;j<=i+1;j++){
                if(i>=j){
                     System.out.print("*");
                }
                else{
                     System.out.print(" ");
                }
            }
             System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=1;i<=num;i++){
            for(int j=num;j>=1;j--){
                if(j>=i){
                     System.out.print("*");
                }
                else{
                     System.out.print("  ");
                } 
            }
             System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=1;i<=num;i++){
            for(int j=1;j>=i+1;j++){
                if(j>=i){
                     System.out.print("*");
                }
                else{
                     System.out.print(" ");
                } 
            }
             System.out.print("\n");
        }
         
        /*Scanner in=new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch=in.next().charAt(0);
        if(ch>='a' && ch>='z'||ch>='A' && ch<='Z'){
            System.out.println("Eligible ");
        }
        else{
            System.out.println("Not eligible");
        }*/
    }
}
