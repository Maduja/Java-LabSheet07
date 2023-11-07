import java.util.Scanner;
public class q4 {
    public static int Total(int a){
        if(a==0){
            return 0;
        }
        else{
            return a%10+Total(a/10);
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=scan.nextInt();
        int sum=Total(num);
        System.out.println(sum);
        
    }
}
