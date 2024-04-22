import java.io.File;
import java.util.Scanner;
import java.io.*;
class EditFile{
    static void read(String filename){
        File file = new File(filename);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static void write(String data,String filename){
        File file = new File(filename);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        String name = scn.next();
        System.out.print("Enter the data to write : ");
        String data = scn.next();
        write(data,name);
        read(name);
    }
}
