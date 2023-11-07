import java.util.Scanner;
public class q3 {
    public static float Diameter(float a){
        float D=2*a;
        return D;
    }
    public static float Circumference(float a){
        float PI=3.14f;
        float C=2*PI*a;
        return C;
    }
    public static float Area(float a){
        float PI=3.14f;
        float A = PI*a*a;
        return A;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = scan.nextInt();
        
        System.out.println("The Diameter of the circle is: "+Diameter(num));
        System.out.println("The circumference of the circle is: "+Circumference(num));
        System.out.println("The Area of the circle is: "+Area(num));
    }
}
