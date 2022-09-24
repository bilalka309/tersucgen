import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        int x= in.nextInt();
        for(int i=x ;i>0;i--){
            for(int k=x;i<k;k--){
                System.out.print(" ");
            }

            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}