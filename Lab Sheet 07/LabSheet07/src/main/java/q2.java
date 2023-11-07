import java.util.Scanner;
public class q2 {
    public static String Type(int a){
        String value;
        if(a%2==0){
            value="Even";
        }
        else{
            value="Odd";
        }
        System.out.println("The number is: "+value);
        return value;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        Type(num);
    }
}
