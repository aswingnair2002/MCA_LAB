import java.util.Scanner;
class NegativeException extends Exception{
    public NegativeException(String s){
        super(s);
    }
}
class Average{
    public static void main(String[] args) {
        int i,sum=0,n=0;
        float avg;
        Scanner scn = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.print("Enter the size : ");
        int s = scn.nextInt();
        System.out.println("Enter the Numbers : ");
        for(i=0;i<s;i++){
            arr[i] = scn.nextInt();
        }
        for(i=0;i<s;i++){
            try{
                if(arr[i]<0){
                    throw new NegativeException("Negative Exeption : "+arr[i]);
                }
            }catch(NegativeException e){
                System.out.println(e.getMessage());
            }
        }
        for(i=0;i<s;i++){
            if(arr[i]>=0){
                sum = sum+arr[i];
                n = n+1;
            }
        }
        avg = sum/n;
        System.out.println("Average is : "+avg);
    }
}
