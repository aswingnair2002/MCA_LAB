import java.util.Scanner;
import java.io.*;
class CopyOddEven {
    static void copy(String input) throws FileNotFoundException{
        FileInputStream in = new FileInputStream(input); 
        FileOutputStream out1 = new FileOutputStream("odd.txt"); 
        FileOutputStream out2 = new FileOutputStream("even.txt"); 
        int n;
        try {
            while ((n = in.read()) != -1) { 
                if(n%2 == 0){
                    out2.write(n); 
                }else{
                    out1.write(n); 
                } 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Source File : ");
        String in = scn.next();
        try {
            copy(in);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
