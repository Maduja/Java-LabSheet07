
public class q5 {
    public static int Sum(int[]arr){
        int sum=0;
        if(arr.length==1){
            return arr[0];
        }
        else{
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            return sum;
        }
    }
    public static void main(String[] args){
        int arr[]={10,20,30,40,50};
        System.out.println(Sum(arr));
        
    }
}
