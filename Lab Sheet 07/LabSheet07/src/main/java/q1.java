import java.util.Scanner;
public class q1 {
    public static String Number(int a){
        String value;
        if(a>0){
            value="Positive";
        }
        else if(a<0){
            value="Negative";
        }
        else{
            value="Equal";
        }
        System.out.println("The number is: "+value);
        return value;
        
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num=scan.nextInt();
        Number(num);
    }
}
