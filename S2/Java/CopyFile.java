
import java.util.Scanner;
import java.io.*;
class CopyFile {
    static void copy(String input,String output) throws FileNotFoundException{
        FileInputStream in = new FileInputStream(input); 
        FileOutputStream out = new FileOutputStream(output); 
        int n;
        try {
            while ((n = in.read()) != -1) { 
                out.write(n); 
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Source File : ");
        String in = scn.next();
        System.out.print("Enter the Destination  File : ");
        String out = scn.next();
        try {
            copy(in,out);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
