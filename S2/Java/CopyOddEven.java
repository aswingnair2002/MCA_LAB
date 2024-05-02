import java.util.Scanner;
import java.io.*;
class CopyOddEven {
    static void copy(String input){
        try (BufferedReader in = new BufferedReader(new FileReader(input));
             BufferedWriter odd = new BufferedWriter(new FileWriter("odd.txt"));
             BufferedWriter even = new BufferedWriter(new FileWriter("even.txt"))){
            String line;
            int n = 1;
            while ((line = in.readLine()) != null) {
                if(n%2 == 0){
                    even.write(line);
                    even.newLine();
                }else{
                    odd.write(line);
                    odd.newLine();
                }
                n++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Source File : ");
        String in = scn.next();
        copy(in);
    }
}
