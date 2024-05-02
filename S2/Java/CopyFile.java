import java.util.Scanner;
import java.io.*;
class CopyFile {
    static void copy(String input,String output){
        try (BufferedReader in = new BufferedReader(new FileReader(input));
             BufferedWriter out = new BufferedWriter(new FileWriter(output))){
            String line;
            while ((line = in.readLine()) != null) {
                out.write(line);
                out.newLine();
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
        copy(in,out);
    }
}
