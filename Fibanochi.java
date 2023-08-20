import java.util.Scanner;

public class Fibanochi {
    public static void main(String[] args) {
        

        int a=0, b=1, num;

        System.out.println("Enter Number --");
        Scanner sc =new Scanner(System.in);
        num=sc.nextInt();

        for(int i=1 ; i<=num ; i++){
        System.out.print(" " + a);

        int c = a+b;
        a = b;
        b=c; 

        }


    }
}
