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
<<<<<<< HEAD
        try{
            for(i=0;i<s;i++){
                if(arr[i]<0){
                    throw new NegativeException("Negative Exeption : "+arr[i]);
                }
            }
        avg = sum/s;
        System.out.println("Average is : "+avg);
        }catch(NegativeException e){
            System.out.println(e.getMessage());
        }finally{
            for(i=0;i<s;i++){
                if(arr[i]>=0){
                    sum = sum+arr[i];
                    n = n+1;
                }
            }
            System.out.println("Average : "+(sum/n));
        }
=======
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
>>>>>>> d6454f27e1af495d44d9b58962287016d7307e91
    }
}
